package com.acttecnology.architectureapi.core.gateways;

import com.acttecnology.architectureapi.core.entities.Pessoa;

import java.util.List;

public interface PessoaGateway {

    Pessoa createPessoa(Pessoa pessoa);

    List<Pessoa> obterPessoas();
}
