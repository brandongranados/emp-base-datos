package com.bd.middleware_bd.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="notificaciones")
public class ModeloNotificaciones {
    @Id
    private String id;
    private Long idSQLServer;
    /* es a la sesion de donde proviene el mensaje */
    private Long idSQLServerOrigen;
    /* es a la sesion a donde se envio el mensaje */
    private Long idSQLServerDestino;
    private String mensaje;
    private String fechaCreacion;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Long getIdSQLServer() {
        return idSQLServer;
    }
    public void setIdSQLServer(Long idSQLServer) {
        this.idSQLServer = idSQLServer;
    }
    public Long getIdSQLServerOrigen() {
        return idSQLServerOrigen;
    }
    public void setIdSQLServerOrigen(Long idSQLServerOrigen) {
        this.idSQLServerOrigen = idSQLServerOrigen;
    }
    public Long getIdSQLServerDestino() {
        return idSQLServerDestino;
    }
    public void setIdSQLServerDestino(Long idSQLServerDestino) {
        this.idSQLServerDestino = idSQLServerDestino;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public String getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
