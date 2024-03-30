package com.acttecnology.architectureapi.infrastructure.dtos;

import com.acttecnology.architectureapi.core.entities.enums.EnumTipoPessoal;

public record PessoaDto(
        String nome,
        String email,
        String cpfCnpj,
        EnumTipoPessoal tipo
) {
}
