package com.acttecnology.architectureapi.core.usecases;

import com.acttecnology.architectureapi.core.entities.Pessoa;

import java.util.List;

public interface GetAllPessoaUseCase {
    List<Pessoa> execute();
}
