package com.acttecnology.architectureapi.core.usecases.impl;

import com.acttecnology.architectureapi.core.entities.Pessoa;
import com.acttecnology.architectureapi.core.gateways.PessoaGateway;
import com.acttecnology.architectureapi.core.usecases.CreatePessoaUseCase;

public class CreatePessoaUseCaseImpl implements CreatePessoaUseCase {

    private final PessoaGateway gateway;

    public CreatePessoaUseCaseImpl(PessoaGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
        return gateway.createPessoa(pessoa);
    }
}
