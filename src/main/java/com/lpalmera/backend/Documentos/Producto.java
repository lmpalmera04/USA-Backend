package com.lpalmera.backend.Documentos;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Producto implements Serializable {

	@Id
	private Integer id;
	private String categoria;
	private String nombre;
	private String descripcion;
	private Float precio;
	private Float inventario;
	private Boolean disponibilidad;
	private String imagen;

	public Producto() {

	}

	public Producto(Integer id, String categoria, String nombre, String descripcion, Float precio, Float inventario, Boolean disponibilidad, String imagen) {
		this.id = id;
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.inventario = inventario;
		this.disponibilidad = disponibilidad;
		this.imagen = imagen;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return categoria;
	}

	public void setCategory(String categoria) {
		this.categoria = categoria;
	}

	public String getName() {
		return nombre;
	}

	public void setName(String nombre) {
		this.nombre = nombre;
	}

	public String getDescription() {
		return descripcion;
	}

	public void setDescription(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPrice() {
		return precio;
	}

	public void setPrice(Float precio) {
		this.precio = precio;
	}

	public Float getStock() {
		return inventario;
	}

	public Boolean isAvailable() {
		return disponibilidad;
	}

	public void setAvailable(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public void setStock(Float inventario) {
		this.inventario = inventario;
	}

	public String getImage() {
		return imagen;
	}

	public void setImage(String imagen) {
		this.imagen = imagen;
	}

}