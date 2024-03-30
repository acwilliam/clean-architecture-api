package com.acttecnology.architectureapi.infrastructure.persistence;

import com.acttecnology.architectureapi.core.entities.enums.EnumTipoPessoal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_PESSOA")
public class PessoaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;
    private String cpfCnpj;
    @Enumerated(EnumType.STRING)
    private EnumTipoPessoal tipo;
}
