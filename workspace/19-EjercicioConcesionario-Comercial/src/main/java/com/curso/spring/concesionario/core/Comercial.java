package com.curso.spring.concesionario.core;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comercial {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String telefono;
	private String correo;
	//private Collection<Long> clientes;
	//private Collection<Long> pedidos;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/*public Collection<Long> getClientes() {
		return clientes;
	}
	public void setClientes(Collection<Long> clientes) {
		this.clientes = clientes;
	}
	public Collection<Long> getPedidos() {
		return pedidos;
	}
	public void setPedidos(Collection<Long> pedidos) {
		this.pedidos = pedidos;
	}*/
	public Comercial(Long id, String nombre, String telefono, String correo, Collection<Long> clientes,
			Collection<Long> pedidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		//this.clientes = clientes;
		//this.pedidos = pedidos;
	}
	public Comercial() {
		super();
		// TODO Auto-generated constructor stub
	}
}
