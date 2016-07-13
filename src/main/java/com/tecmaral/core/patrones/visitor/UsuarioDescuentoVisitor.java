package com.tecmaral.core.patrones.visitor;

public class UsuarioDescuentoVisitor implements UsuarioVisitor {
	 
	   private float descuento;
	 
	   @Override
	   public void visit(Cliente cliente) {
	      descuento = 10;
	   }
	 
	   @Override
	   public void visit(Operador operador) {
	      descuento = 30;
	   }
	 
	   public float getDescuento() {
	      return descuento;
	   }
	}