package com.tecmaral.core.patrones.filtros.ejemplo;

import com.tecmaral.core.patrones.filtros.CompositeFilter;
import com.tecmaral.core.patrones.filtros.IFilter;


public class FiltroUno {

	private IFilter filtroUno;
	
	
	public FiltroUno(){
		
		
		ConsultaDescripcion consultaDescripcion = new ConsultaDescripcion();
		ConsultaBeneficios consultaBeneficios = new ConsultaBeneficios();
		CascadaUnoFilter cascadoUnoFilter = new CascadaUnoFilter();
		CascadaDosFilter cascadaDosFilter = new CascadaDosFilter();
		CascadaTresFilter cascadaTresFilter = new CascadaTresFilter();
		
		cascadoUnoFilter.setNextFilter(cascadaDosFilter);
		cascadaDosFilter.setNextFilter(cascadaTresFilter);
		
		filtroUno = new CompositeFilter();
		
		filtroUno.addFilter(cascadoUnoFilter);
		filtroUno.addFilter(consultaDescripcion);
		filtroUno.addFilter(consultaBeneficios);
	
		
		
	}


	public IFilter getFiltroUno() {
		return filtroUno;
	}

	public void setFiltroUno(IFilter filtroUno) {
		this.filtroUno = filtroUno;
	}
	
	
}
