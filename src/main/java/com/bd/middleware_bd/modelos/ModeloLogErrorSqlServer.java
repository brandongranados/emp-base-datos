package com.bd.middleware_bd.modelos;

import java.time.LocalDateTime;
import java.time.ZoneId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="log_error")
public class ModeloLogErrorSqlServer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_log_error")
    private Long id;
    @Column(name="gestor_bd", nullable=false)
    private String gestorBD;
    @Column(name="fecha_error_generado", nullable=false)
    private LocalDateTime fechaErrorGenerado;
    @Column(name="observacion_error", nullable=false)
    private String observaciones;

    public ModeloLogErrorSqlServer(String gestorBD, String observaciones)
    {
        this.gestorBD = gestorBD;
        this.observaciones = observaciones;
        this.fechaErrorGenerado = LocalDateTime.now(ZoneId.of("UTC"));
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getGestorBD() {
        return gestorBD;
    }
    public void setGestorBD(String gestorBD) {
        this.gestorBD = gestorBD;
    }
    public LocalDateTime getFechaErrorGenerado() {
        return fechaErrorGenerado;
    }
    public void setFechaErrorGenerado(LocalDateTime fechaErrorGenerado) {
        this.fechaErrorGenerado = fechaErrorGenerado;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
