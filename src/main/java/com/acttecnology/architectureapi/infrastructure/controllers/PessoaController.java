package com.acttecnology.architectureapi.infrastructure.controllers;

import com.acttecnology.architectureapi.core.usecases.CreatePessoaUseCase;
import com.acttecnology.architectureapi.infrastructure.dtos.PessoaDto;
import com.acttecnology.architectureapi.infrastructure.mapper.PessoaDtoMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pessoas")
@AllArgsConstructor
public class PessoaController {

    private final CreatePessoaUseCase createPessoaUseCase;
    private final PessoaDtoMapper pessoaDtoMapper;


    @PostMapping
    public PessoaDto createPessoa(@RequestBody PessoaDto pessoaDto) {
        var toPessoa = pessoaDtoMapper.toEntity(pessoaDto);
        var novaPessoa = createPessoaUseCase.execute(toPessoa);
        return pessoaDtoMapper.toDto(novaPessoa);
    }
}
