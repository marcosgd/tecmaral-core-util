package com.tecmaral.core.patrones.visitor;

public interface UsuarioVisitor {
	 
	   void visit(Cliente cliente);
	   void visit(Operador operador);
	}