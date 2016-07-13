package com.tecmaral.core.patrones.filtros;



public class SimpleFilter extends AbstractSimpleFilter {

	@Override
	public Object apply(final Object original,
			final Object target) {
		return target;
	}
}
