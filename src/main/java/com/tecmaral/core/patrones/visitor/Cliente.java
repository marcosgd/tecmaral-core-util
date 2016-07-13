package com.tecmaral.core.patrones.visitor;

public class Cliente implements Usuario {
	 
	   @Override
	   public void accept(UsuarioVisitor visitor) {
	      visitor.visit(this);
	   }
	 
	}
