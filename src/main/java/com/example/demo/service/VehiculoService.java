package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoService {

	public void agregar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscar(String placa);
	public void borrar(String placa);
	public List<Vehiculo> buscarTodos();
	
	
}
