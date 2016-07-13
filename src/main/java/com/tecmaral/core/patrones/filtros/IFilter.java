package com.tecmaral.core.patrones.filtros;


/**
 * Ejemplo de filtros , cadena responsabilidad composicion
 * 
 * @Autowired
 * private IFilter filtroPrueba; 
 * Object object = filtroTarifaActualPospago.apply(object,null); ...
 * 
 * <bean id="filtroPrueba"
		class="com.tecmaral.patrones.filtros.CompositeFilter">
		<property name="filtros">
			<list>
				<ref bean="filtro1"  />   
				<ref bean="filtro2"  />
				<ref bean="filtroCascada"  />
				
			</list>
		</property>
</bean>

<bean id="filtro1" class="com.tecmaral.core.patrones.filtros.ejemplo.ConsultaBeneficios"/>
<bean id="filtro2" class="com.tecmaral.core.patrones.filtros.ejemplo.ConsultaDescripcion"/>
<bean id="filtroCascada" 	class="com.tecmaral.core.patrones.filtros.ejemplo.CascadaUnoFilter">
		<property name="nextFilter">
			<ref bean="filtroCascada2" />
		</property>
</bean>

<bean id="filtroCascada2" 	class="com.tecmaral.core.patrones.filtros.ejemplo.CascadaDosFilter">
		<property name="nextFilter">
			<ref bean="filtroCascada3" />
		</property>
</bean>
<bean id="filtroCascada3" 	class="com.tecmaral.core.patrones.filtros.ejemplo.CascadaTresFilter"/>


 * @author mgonzalezdi
 *
 */
public interface IFilter {

	/**
	 * @param original
	 * @param target
	 * @return
	 */
	public Object apply(final Object original,
			final Object target) throws Exception;

	/**
	 * @param aFilter
	 */
	public void addFilter(final IFilter aFilter);

	/**
	 * @param aFilter
	 */
	public void removeFilter(final IFilter aFilter);

}