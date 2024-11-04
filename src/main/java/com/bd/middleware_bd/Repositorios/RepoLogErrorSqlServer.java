package com.bd.middleware_bd.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bd.middleware_bd.modelos.ModeloLogErrorSqlServer;

@Repository
public interface RepoLogErrorSqlServer 
extends JpaRepository<ModeloLogErrorSqlServer, Long> {}