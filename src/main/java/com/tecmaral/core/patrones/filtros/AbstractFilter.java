package com.tecmaral.core.patrones.filtros;


public abstract class AbstractFilter implements IFilter {

	public Object apply(final Object original,
			final Object target)  throws Exception{
		return null;
	}

	public void addFilter(final IFilter aFilter) {
	}

	public void removeFilter(final IFilter aFilter) {
	}
}