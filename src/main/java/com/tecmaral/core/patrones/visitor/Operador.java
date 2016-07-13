package com.tecmaral.core.patrones.visitor;

public class Operador implements Usuario {
	 
	   @Override
	   public void accept(UsuarioVisitor visitor) {
	      visitor.visit(this);
	   }
	 
	}