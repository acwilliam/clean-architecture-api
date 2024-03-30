package com.acttecnology.architectureapi.core.usecases;

import com.acttecnology.architectureapi.core.entities.Pessoa;

public interface CreatePessoaUseCase {

    Pessoa execute(Pessoa pessoa);
}
