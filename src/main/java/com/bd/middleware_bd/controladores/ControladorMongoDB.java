package com.bd.middleware_bd.controladores;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bd.middleware_bd.modelos.ModeloNotificaciones;
import com.bd.middleware_bd.servicios.ConsultasMongo;


@RestController
@RequestMapping("mongoDB")
public class ControladorMongoDB {
    @Autowired
    private ConsultasMongo mongo;

    @PostMapping("/getSesiones")
    public ResponseEntity<Object> getObjetosPorSesion(@RequestBody HashMap<String, String> datos)
    {
        List<ModeloNotificaciones> res = mongo.getObjetosPorSesion(datos);

        return res != null                              ?
                ResponseEntity.ok(res)                  :
                ResponseEntity.badRequest().build();
    }
}
