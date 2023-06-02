package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{
private static List<Vehiculo> baseVehiculo= new ArrayList<>();
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		baseVehiculo.add(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.eliminar(vehiculo.getPlaca());
		this.insertar(vehiculo);
	}

	@Override
	public Vehiculo encontrar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo= new Vehiculo();
		
		for(Vehiculo vehi:baseVehiculo) {
			if(placa.equals(vehi.getPlaca())) {
				
				vehiculo=vehi;
			}
			
			
		}
		
		
		return vehiculo;
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo= this.encontrar(placa);
		baseVehiculo.remove(vehiculo);
	}

	@Override
	public List<Vehiculo> buscarTodos() {
		// TODO Auto-generated method stub
		return baseVehiculo;
	}

}
