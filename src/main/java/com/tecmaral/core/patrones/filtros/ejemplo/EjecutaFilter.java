package com.tecmaral.core.patrones.filtros.ejemplo;

import com.tecmaral.core.patrones.filtros.IFilter;

public class EjecutaFilter {

	
	public static void main(String[] args) {
		
		IFilter filtroUno = new  FiltroUno().getFiltroUno();
		IFilter filtroDos = new  FiltroDos().getFiltroDos();
		ProductoDTO destino1 = new ProductoDTO();
		ProductoDTO destino2 = new ProductoDTO();
			
		try {
				destino1 = (ProductoDTO) filtroUno.apply(null, null);
				destino2 = (ProductoDTO) filtroDos.apply(null, null);
		} catch (Exception e) {
				System.out.println("ERROR aplicando filtro" + e.getMessage());
		}
			
		System.out.println("Filtro UNO:" + destino1);
		System.out.println("Filtro DOS:" + destino2);
	}
}
