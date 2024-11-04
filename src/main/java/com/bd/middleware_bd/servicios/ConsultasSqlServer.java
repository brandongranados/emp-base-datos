package com.bd.middleware_bd.servicios;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.middleware_bd.Repositorios.RepoDatosSesionSqlServer;
import com.bd.middleware_bd.modelos.ModeloDatosSesionSQLServer;

@Service
public class ConsultasSqlServer {
    @Autowired
    private RepoDatosSesionSqlServer sesion;

    public int getVerificarSesion(HashMap<String, String> datos)
    {    
        return sesion.getDatosInicioSesion(datos.get("correo"), datos.get("contra"));
    }

    public List<ModeloDatosSesionSQLServer> getSesiones()
    {
        return sesion.getInformacion();
    }
}
