package com.tecmaral.core.patrones.visitor;


public class UsuarioPrintVisitor implements UsuarioVisitor {

  @Override
  public void visit(Cliente cliente) {
     System.out.println("Soy un cliente");
  }

  @Override
  public void visit(Operador operador) {
     System.out.println("Soy un operador");
  }

}