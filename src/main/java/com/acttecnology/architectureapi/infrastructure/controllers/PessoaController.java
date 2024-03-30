package com.acttecnology.architectureapi.infrastructure.controllers;

import com.acttecnology.architectureapi.core.entities.Pessoa;
import com.acttecnology.architectureapi.core.usecases.CreatePessoaUseCase;
import com.acttecnology.architectureapi.core.usecases.GetAllPessoaUseCase;
import com.acttecnology.architectureapi.infrastructure.dtos.PessoaDto;
import com.acttecnology.architectureapi.infrastructure.mapper.PessoaDtoMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/pessoas")
@AllArgsConstructor
public class PessoaController {

    private final CreatePessoaUseCase createPessoaUseCase;
    private final PessoaDtoMapper pessoaDtoMapper;
    private final GetAllPessoaUseCase getAllPessoaUseCase;


    @PostMapping
    public ResponseEntity<PessoaDto> createPessoa(@RequestBody PessoaDto pessoaDto) {
        var toPessoa = pessoaDtoMapper.toEntity(pessoaDto);
        var novaPessoa = createPessoaUseCase.execute(toPessoa);
       var ret = pessoaDtoMapper.toDto(novaPessoa);

       return ResponseEntity.created(URI.create("api/pessoas")).body(ret);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<PessoaDto>> getAllPessoaDto() {
        List<Pessoa> pessoas = getAllPessoaUseCase.execute();
        return ResponseEntity.ok(pessoaDtoMapper.toDtoList(pessoas));
    }
}
