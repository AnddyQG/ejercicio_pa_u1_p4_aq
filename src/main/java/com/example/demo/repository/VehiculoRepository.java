package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoRepository {

	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo encontrar(String placa);
	public void eliminar(String placa);
	public List<Vehiculo> buscarTodos();
	
}
