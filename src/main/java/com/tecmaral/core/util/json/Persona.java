package com.tecmaral.core.util.json;

public class Persona {
	// Nota: Para atributos públicos, no es necesario usar getters y setters.
	  public String nombre;
	  public int edad;
	  // Nota: Si los campos son private o protected, es obligatorio usar getters y setters.
	  // Es recomendable crear el constructor por defecto
	
	  public static Persona getMock(){
		  
		  Persona persona = new Persona();
		  persona.edad=36;
		  persona.nombre="Marcos Gonzalez Diaz";
		  return persona;
	  }

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	  
	  
}
