package com.tecmaral.core.patrones.filtros;



public abstract class AbstractCascadeFilter extends AbstractFilter {


	private IFilter nextFilter;

	public Object apply(final Object original,
			final Object target) throws Exception {
	
		Object out = specificApply(original, target);
		if (nextFilter != null) {
			out = nextFilter.apply(original, out);
		}
		return out;
	}

	/**
	 * @param original
	 * @param target
	 * @return
	 */
	public abstract Object specificApply(final Object original,
			final Object target) throws Exception;

	/**
	 * @return
	 */
	public IFilter getNextFilter() {
		return nextFilter;
	}

	/**
	 * @param nextFilter
	 */
	public void setNextFilter(final IFilter nextFilter) {
		this.nextFilter = nextFilter;
	}

	@Override
	public void addFilter(final IFilter aFilter) {
		this.nextFilter = aFilter;
	}
}