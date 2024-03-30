package com.acttecnology.architectureapi.infrastructure.configuration;

import com.acttecnology.architectureapi.core.gateways.PessoaGateway;
import com.acttecnology.architectureapi.core.usecases.CreatePessoaUseCase;
import com.acttecnology.architectureapi.core.usecases.impl.CreatePessoaUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePessoaUseCase createPessoaUseCase(PessoaGateway gateway) {
        return new CreatePessoaUseCaseImpl(gateway);
    }
}
