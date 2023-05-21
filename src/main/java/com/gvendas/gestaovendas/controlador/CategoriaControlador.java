package com.gvendas.gestaovendas.controlador;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gvendas.gestaovendas.dto.categoria.CategoriaRequestDTO;
import com.gvendas.gestaovendas.dto.categoria.CategoriaResponseDTO;
import com.gvendas.gestaovendas.entidades.Categoria;
import com.gvendas.gestaovendas.servico.CategoriaServico;


@RestController
@RequestMapping("/categoria")
public class CategoriaControlador {

	@Autowired
	private CategoriaServico categoriaServico;

	@GetMapping
	public List<CategoriaResponseDTO> listarTodas() {
		return categoriaServico.listarTodas().stream()
				.map(categoria -> CategoriaResponseDTO.converterParaCategoriaDTO(categoria))
				.collect(Collectors.toList());
	}

	@GetMapping("/{codigo}")
	public ResponseEntity<CategoriaResponseDTO> buscarPorId(@PathVariable Long codigo) {
		Optional<Categoria> categoria = categoriaServico.buscarPorCodigo(codigo);
		return categoria.isPresent()
				? ResponseEntity.ok(CategoriaResponseDTO.converterParaCategoriaDTO(categoria.get()))
				: ResponseEntity.notFound().build();
	}

	@PostMapping
	public ResponseEntity<CategoriaResponseDTO> salvar(@Valid @RequestBody CategoriaRequestDTO categoriaDto) {
		Categoria categoriaSalva = categoriaServico.salvar(categoriaDto.converterParaEntidade());
		return ResponseEntity.status(HttpStatus.CREATED).body(CategoriaResponseDTO.converterParaCategoriaDTO(categoriaSalva));
	}

	@PutMapping("/{codigo}")
	public ResponseEntity<CategoriaResponseDTO> atualizar(@PathVariable Long codigo, @Valid @RequestBody CategoriaRequestDTO categoriaDto) {
		Categoria categoriaAtualizada = categoriaServico.atualizar(codigo, categoriaDto.converterParaEntidade(codigo));
		return ResponseEntity.ok(CategoriaResponseDTO.converterParaCategoriaDTO(categoriaAtualizada));
	}

	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long codigo) {
		categoriaServico.deletar(codigo);
	}
}
