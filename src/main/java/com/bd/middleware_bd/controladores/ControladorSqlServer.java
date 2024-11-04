package com.bd.middleware_bd.controladores;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bd.middleware_bd.modelos.ModeloDatosSesionSQLServer;
import com.bd.middleware_bd.servicios.ConsultasSqlServer;

@RestController
@RequestMapping("sqlServer")
public class ControladorSqlServer {
    @Autowired
    private ConsultasSqlServer sql;

    @PostMapping("/getVerificaCredenciales")
    public ResponseEntity<Object> getVerificaCredenciales
    (
        @RequestBody HashMap<String, String> cuerpo,
        @RequestHeader HashMap<String, String> cabecera
    )
    {
        int sel = sql.getVerificarSesion(cuerpo);

        return  sel > 0                                 ? 
                ResponseEntity.ok().build()             :
                ResponseEntity.badRequest().build();
    }

    @PostMapping("/getSesiones")
    public ResponseEntity<Object> getSesiones(@RequestHeader HashMap<String, String> cabecera)
    {
        List<ModeloDatosSesionSQLServer> ret = sql.getSesiones();

        return ret != null                              ?
                ResponseEntity.ok(ret)                  :
                ResponseEntity.badRequest().build();
    }
}
