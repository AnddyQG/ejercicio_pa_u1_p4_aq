package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricular;

@Repository
public class MatriculaRepositoryImpl implements MatricularRepository{
private static List<Matricular> baseMatricula= new ArrayList<>();
	@Override
	public void matricula(Matricular matricular) {
		// TODO Auto-generated method stub
		baseMatricula.add(matricular);
	}

}
