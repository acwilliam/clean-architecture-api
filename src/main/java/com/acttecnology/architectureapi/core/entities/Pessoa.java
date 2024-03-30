package com.acttecnology.architectureapi.core.entities;

import com.acttecnology.architectureapi.core.entities.enums.EnumTipoPessoal;

public record Pessoa(
        Long id,
        String nome,
        String email,
        String cpfCnpj,
        EnumTipoPessoal tipo
) {
}
