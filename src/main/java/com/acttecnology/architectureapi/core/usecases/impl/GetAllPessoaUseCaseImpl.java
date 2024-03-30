package com.acttecnology.architectureapi.core.usecases.impl;

import com.acttecnology.architectureapi.core.entities.Pessoa;
import com.acttecnology.architectureapi.core.gateways.PessoaGateway;
import com.acttecnology.architectureapi.core.usecases.GetAllPessoaUseCase;

import java.util.List;

public class GetAllPessoaUseCaseImpl implements GetAllPessoaUseCase {

    private final PessoaGateway gateway;

    public GetAllPessoaUseCaseImpl(PessoaGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<Pessoa> execute() {
        return gateway.obterPessoas();
    }
}
