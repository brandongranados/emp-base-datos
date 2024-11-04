package com.bd.middleware_bd.servicios;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.middleware_bd.Repositorios.RepoNotificacionesMongo;
import com.bd.middleware_bd.modelos.ModeloNotificaciones;

@Service
public class ConsultasMongo {
    @Autowired
    private RepoNotificacionesMongo mongo;

    public List<ModeloNotificaciones> getObjetosPorSesion(HashMap<String, String> datos)
    {
        return mongo.findAll();
    }
}
