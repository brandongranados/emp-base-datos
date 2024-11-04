package com.bd.middleware_bd.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bd.middleware_bd.modelos.ModeloDatosSesionSQLServer;

@Repository
public interface RepoDatosSesionSqlServer 
extends JpaRepository<ModeloDatosSesionSQLServer, String> {
    @Query(value="SELECT COUNT(*) FROM v_datos_de_sesion "+
                " WHERE correo_electronico = :correo AND contrasena = :contra", 
            nativeQuery=true)
    public int getDatosInicioSesion
    (
        @Param("correo") String correo,
        @Param("contra") String contra
    );

    @Query(value="SELECT nombre, correo_electronico, fecha_nacimiento, "+
                " sexo, nombre_rol, '' AS contrasena FROM v_datos_de_sesion", 
            nativeQuery=true)
    public List<ModeloDatosSesionSQLServer> getInformacion();
}
