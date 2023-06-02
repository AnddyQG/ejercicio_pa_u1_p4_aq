package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Matricular;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.MatricularService;
import com.example.demo.service.PropietarioService;
import com.example.demo.service.VehiculoService;

@SpringBootApplication
public class EjercicioPaU1P4AqApplication implements CommandLineRunner{
@Autowired
private VehiculoService service;
@Autowired
private PropietarioService propietarioService;
@Autowired
private MatricularService matricularService;
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4AqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo= new Vehiculo();
		vehiculo.setMarca("MAZDA");
		vehiculo.setModelo("DEPORTIVO");
		vehiculo.setPlaca("1721");
		vehiculo.setPrecio(new BigDecimal(400));
		//1 crear un vehiculo
		vehiculo.setTipo("automatico");
		this.service.agregar(vehiculo);
		vehiculo.setMarca("LAMBORGINI");
		vehiculo.setModelo("CARRERAS");
		//2 actualizar un vehiculo
		this.service.actualizar(vehiculo);
		//revision
		this.service.buscarTodos().stream().forEach(System.out::println);
		//3. crear un propietario
		
		Propietario propietario= new Propietario();
		propietario.setNombre("Anddy");
		propietario.setApellido("Quisilema");
		propietario.setIdentificacion("30500");
		propietario.setFechaDeNacimiento(LocalDate.of(2000, 07, 19));
		
		this.propietarioService.agregar(propietario);
		
		this.propietarioService.buscarTodos().stream().forEach(System.out::println);
		
		
		//4.realizar una matricula
	
		this.matricularService.matriculacion(propietario.getIdentificacion(), vehiculo.getPlaca());
		
		
	}

}
