package com.tecmaral.core.patrones.filtros.ejemplo;

public class ProductoDTO {

	private String beneficios;
	private String descripcion;
	
	private String cascada1;
	private String cascada2;
	private String cascada3;
	
	public String getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCascada1() {
		return cascada1;
	}
	public void setCascada1(String cascada1) {
		this.cascada1 = cascada1;
	}
	public String getCascada2() {
		return cascada2;
	}
	public void setCascada2(String cascada2) {
		this.cascada2 = cascada2;
	}
	public String getCascada3() {
		return cascada3;
	}
	public void setCascada3(String cascada3) {
		this.cascada3 = cascada3;
	}
	@Override
	public String toString() {
		return "ProductoDTO [beneficios=" + beneficios + ", descripcion="
				+ descripcion + ", cascada1=" + cascada1 + ", cascada2="
				+ cascada2 + ", cascada3=" + cascada3 + "]";
	}
	
	
}

