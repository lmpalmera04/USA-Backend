package com.lpalmera.backend.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lpalmera.backend.Documentos.Secuencia;

@Repository
public interface RepositorioSecuencia extends MongoRepository<Secuencia, String> {
	
}
