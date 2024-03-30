package com.acttecnology.architectureapi.infrastructure.mapper;

import com.acttecnology.architectureapi.core.entities.Pessoa;
import com.acttecnology.architectureapi.infrastructure.dtos.PessoaDto;
import org.springframework.stereotype.Component;

@Component
public class PessoaDtoMapper {

    public PessoaDto toDto(Pessoa pessoa) {
        return new PessoaDto(pessoa.nome(), pessoa.email(), pessoa.cpfCnpj(),pessoa.tipo());
    }

    public Pessoa toEntity(PessoaDto pessoaDto) {
        return new Pessoa(null,pessoaDto.nome(), pessoaDto.email(), pessoaDto.cpfCnpj(), pessoaDto.tipo());
    }
}
