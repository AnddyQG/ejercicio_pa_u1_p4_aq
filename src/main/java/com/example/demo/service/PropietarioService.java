package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioService {

	public void agregar(Propietario propietario);
	public void actualizar(Propietario propietario);
	public Propietario buscar(String identificacion);
	public void borrar(String identificacion);
	public List<Propietario> buscarTodos();
	
}
