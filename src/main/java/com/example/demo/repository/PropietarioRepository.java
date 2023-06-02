package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioRepository {

	
	public void insertar(Propietario propietario);
	public void actualizar(Propietario propietario);
	public Propietario encontrar(String identificacion);
	public void eliminar(String identificacion);
	public List<Propietario> buscarTodos();
	
	
}
