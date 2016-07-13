package com.tecmaral.core.patrones.filtros.ejemplo;


import com.tecmaral.core.patrones.filtros.AbstractSimpleFilter;

public class ConsultaBeneficios extends AbstractSimpleFilter {
	@Override
	public Object apply(final Object original, final Object target) {
		ProductoDTO producto = null;
		if (target==null) producto = new ProductoDTO();
		else  producto = (ProductoDTO)target;
		
		producto.setBeneficios("beneficios1");
		return producto;

	}
}
