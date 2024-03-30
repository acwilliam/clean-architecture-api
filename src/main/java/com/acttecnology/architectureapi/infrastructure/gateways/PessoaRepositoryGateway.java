package com.acttecnology.architectureapi.infrastructure.gateways;

import com.acttecnology.architectureapi.core.entities.Pessoa;
import com.acttecnology.architectureapi.core.gateways.PessoaGateway;
import com.acttecnology.architectureapi.infrastructure.mapper.PessoaEntityMapper;
import com.acttecnology.architectureapi.infrastructure.persistence.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class PessoaRepositoryGateway implements PessoaGateway {

    private final PessoaRepository pessoaRepository;
    private final PessoaEntityMapper pessoaEntityMapper;

    @Override
    public Pessoa createPessoa(Pessoa pessoa) {
        var pessoaEntity = pessoaEntityMapper.toEntity(pessoa);
        return pessoaEntityMapper.toPessoa(pessoaRepository.save(pessoaEntity));
    }

    @Override
    public List<Pessoa> obterPessoas() {
       return pessoaRepository
               .findAll()
               .stream()
               .map(pessoaEntityMapper::toPessoa)
               .collect(Collectors.toList());
    }

}
