package com.tecmaral.core.patrones.visitor;

public class EjecutaVisitor {

	/**
	 * el patrón visitor es una forma de separar el algoritmo de la estructura de un objeto.
	 * (Nunca mas if…else…switch) 
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Usuario c = new Cliente();
	      //Supongamos que nuestro programa recibe un Usuario x.
	      //Para cualquier usuario ya no necesitamos condicionales.
	      UsuarioVisitor vPrint = new UsuarioPrintVisitor();
	      UsuarioDescuentoVisitor vDes = new UsuarioDescuentoVisitor();
	      c.accept(vPrint);
	      c.accept(vDes);
	      System.out.println(vDes.getDescuento());
	}

}
