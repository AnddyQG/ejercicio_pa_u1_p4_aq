package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatricularRepository;
import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Matricular;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class MatricularServiceImpl implements MatricularService{
@Autowired
private MatricularRepository matricularRepository;
@Autowired
private PropietarioRepository propietarioRepository;

@Autowired
private VehiculoRepository repository;
	@Override
	public void matriculacion(String identificacion, String placa) {
		// TODO Auto-generated method stub
		Propietario propietario= this.propietarioRepository.encontrar(identificacion);
		Vehiculo vehiculo= this.repository.encontrar(placa);
		Matricular matricular= new Matricular();
		matricular.setPropietario(propietario);
		matricular.setVehiculo(vehiculo);
		matricular.setFechaDeMatricula(LocalDate.now());
		BigDecimal valorMatricula= null;
		
		if(vehiculo.getTipo().equals("manual")) {
			valorMatricula= vehiculo.getPrecio().multiply(new BigDecimal(0.10));
			
			
		}else {
			valorMatricula= vehiculo.getPrecio().multiply(new BigDecimal(0.15));
			
		}if(valorMatricula.compareTo(new BigDecimal(3000))>0) {
			BigDecimal descuento= valorMatricula.multiply(new BigDecimal(0.09));
			valorMatricula=valorMatricula.subtract(descuento);
			
		}
			
			
		matricular.setValorDeMatricula(valorMatricula);
		this.matricularRepository.matricula(matricular);
		System.out.println(matricular);
		
		
		
		
		
		
		
	}

}
