package com.acttecnology.architectureapi.infrastructure.controllers.handlers;

import com.acttecnology.architectureapi.infrastructure.controllers.PessoaController;
import com.acttecnology.architectureapi.infrastructure.response.ResponseDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLException;
import java.time.LocalDateTime;

@ControllerAdvice(assignableTypes = {PessoaController.class})
public class PessoaControllerHandler {

    @ExceptionHandler(SQLException.class)
    public ResponseEntity<ResponseDefault> handleException(SQLException ex) {
        ResponseDefault responseDefault = new ResponseDefault(
                HttpStatus.CONFLICT.value(),
                LocalDateTime.now(),
                "Cpf ou cpnj já cadastrado",
                ex.getMessage()

        );
        return ResponseEntity.status(HttpStatus.CONFLICT).body(responseDefault);
    }
}
