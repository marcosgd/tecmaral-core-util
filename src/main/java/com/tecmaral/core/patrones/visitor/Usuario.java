package com.tecmaral.core.patrones.visitor;

public interface Usuario {
	 
	   void accept(UsuarioVisitor visitor);
	}