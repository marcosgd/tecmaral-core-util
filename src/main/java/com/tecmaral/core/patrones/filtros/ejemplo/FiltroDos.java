package com.tecmaral.core.patrones.filtros.ejemplo;

import com.tecmaral.core.patrones.filtros.CompositeFilter;
import com.tecmaral.core.patrones.filtros.IFilter;


public class FiltroDos {

	private IFilter filtroDos;
	
	
	public FiltroDos(){
		
		
		ConsultaDescripcion consultaDescripcion = new ConsultaDescripcion();
		ConsultaBeneficios consultaBeneficios = new ConsultaBeneficios();
		
		
		filtroDos = new CompositeFilter();
		filtroDos.addFilter(consultaDescripcion);
		filtroDos.addFilter(consultaBeneficios);
	
		
		
	}


	public IFilter getFiltroDos() {
		return filtroDos;
	}

	public void setFiltroDos(IFilter filtroDos) {
		this.filtroDos = filtroDos;
	}
	
	
}
