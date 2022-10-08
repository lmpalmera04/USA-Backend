package com.lpalmera.backend.Documentos;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Secuencia implements Serializable {

	@Id
	private String id;
	private Integer valor;

	public Secuencia() {

	}

	public Secuencia(String id, Integer valor) {
		this.id = id;
		this.valor = valor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getValue() {
		return valor;
	}

	public void setValue(Integer valor) {
		this.valor = valor;
	}

	public Integer increment() {
		return ++valor;
	}

}
