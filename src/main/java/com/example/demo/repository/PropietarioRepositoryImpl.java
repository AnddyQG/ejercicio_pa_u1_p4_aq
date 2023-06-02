package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository{
private static List<Propietario> basePropietario= new ArrayList<>();
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
	basePropietario.add(propietario);	
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.eliminar(propietario.getIdentificacion());
		this.insertar(propietario);
	}

	@Override
	public Propietario encontrar(String identificacion) {
		// TODO Auto-generated method stub
		
		Propietario propietario= new Propietario();
		for(Propietario prop :basePropietario) {
			if(identificacion.equals(prop.getIdentificacion())) {
				propietario=prop;
			}
			
		}
		
		return propietario;
	}

	@Override
	public void eliminar(String identificacion) {
		// TODO Auto-generated method stub
		Propietario propietario=this.encontrar(identificacion);
		basePropietario.remove(propietario);
	}

	@Override
	public List<Propietario> buscarTodos() {
		// TODO Auto-generated method stub
		return basePropietario;
	}

}
