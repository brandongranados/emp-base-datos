package com.bd.middleware_bd.configuracion;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bd.middleware_bd.Repositorios.RepoLogErrorSqlServer;
import com.bd.middleware_bd.modelos.ModeloLogErrorSqlServer;

@ControllerAdvice
public class Excepciones {
    @Autowired
    private RepoLogErrorSqlServer logError;

    @ExceptionHandler
    public ResponseEntity<Object> respuesta(Exception error)
    {
        try {
            logError.save
            (
                new ModeloLogErrorSqlServer
                (
                    Base64.getEncoder().encodeToString("".getBytes()), 
                    Base64.getEncoder().encodeToString(error.getMessage().getBytes())
                )
            );
        } catch (Exception e) {}
        
        return ResponseEntity.internalServerError().build();
    }
}
