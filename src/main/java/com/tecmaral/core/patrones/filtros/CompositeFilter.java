package com.tecmaral.core.patrones.filtros;


import java.util.ArrayList;

public class CompositeFilter extends AbstractFilter {

	public ArrayList<IFilter> filtros = new ArrayList<IFilter>();

	@Override
	public Object apply(final Object original,
			final Object target) throws Exception {
		// La primera vez el out, es nulo que es el que se va transformando.
		// El original se mantiene por si hiciera falta obtener  datos 
		Object out = null;
		for (final IFilter item : filtros) {
			out = item.apply(original, out);
		}
		return out;
	}

	/**
	 * @return
	 */
	public ArrayList<IFilter> getFiltros() {
		return filtros;
	}

	/**
	 * @param filtros
	 */
	public void setFiltros(final ArrayList<IFilter> filtros) {
		this.filtros = filtros;
	}

	@Override
	public void addFilter(final IFilter aFilter) {
		this.filtros.add(aFilter);
	}

}