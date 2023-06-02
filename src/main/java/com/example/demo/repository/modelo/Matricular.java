package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Matricular {

	private LocalDate fechaDeMatricula;
	private BigDecimal valorDeMatricula;
	private Propietario propietario;
	private Vehiculo vehiculo;
	@Override
	public String toString() {
		return "Matricular [fechaDeMatricula=" + fechaDeMatricula + ", valorDeMatricula=" + valorDeMatricula
				+ ", propietario=" + propietario + ", vehiculo=" + vehiculo + "]";
	}
	public LocalDate getFechaDeMatricula() {
		return fechaDeMatricula;
	}
	public void setFechaDeMatricula(LocalDate fechaDeMatricula) {
		this.fechaDeMatricula = fechaDeMatricula;
	}
	public BigDecimal getValorDeMatricula() {
		return valorDeMatricula;
	}
	public void setValorDeMatricula(BigDecimal valorDeMatricula) {
		this.valorDeMatricula = valorDeMatricula;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	
	
}
