package com.example.Api1.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.example.Api1.entity.*;
import com.example.Api1.modelo.*;


@Component("convertidor")
public class Convertidor {

	public List<MNota> convertirLista(List<Nota> notas){
		List<MNota> mnotas = new ArrayList<>();
		
		for(Nota nota : notas) {
			mnotas.add(new MNota(nota));
			
		}		
		return mnotas;
		
	}	
}