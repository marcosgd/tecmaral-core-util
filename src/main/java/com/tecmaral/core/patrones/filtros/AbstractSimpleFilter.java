package com.tecmaral.core.patrones.filtros;

public abstract class AbstractSimpleFilter extends AbstractFilter {
	
	@Override
	public final void addFilter(final IFilter aFilter) {
		super.addFilter(aFilter);
	}

	@Override
	public final void removeFilter(final IFilter aFilter) {
		super.removeFilter(aFilter);
	}

}
