package com.acttecnology.architectureapi.infrastructure.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class ResponseDefault {

    private int status;
    private LocalDateTime date;
    private String messageError;
    private String description;

}
