package com.tecmaral.core.patrones.filtros.ejemplo;

import com.tecmaral.core.patrones.filtros.ejemplo.ProductoDTO;
import com.tecmaral.core.patrones.filtros.AbstractCascadeFilter;

public class CascadaTresFilter extends AbstractCascadeFilter {

	@Override
	public Object specificApply(Object original, Object target)
			throws Exception {
		ProductoDTO producto = null;
		if (target==null) producto = new ProductoDTO();
		else  producto = (ProductoDTO)target;
		
		producto.setCascada3("cascada3");
		return producto;
	}

}
