package com.bd.middleware_bd.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bd.middleware_bd.modelos.ModeloNotificaciones;

public interface RepoNotificacionesMongo
extends MongoRepository<ModeloNotificaciones, String> {
    
}
