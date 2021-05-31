package entities;

import entities.enums.Color;

public abstract class Shape {
//variáveis	
	private Color color;
	
//Construtores
//vazio
	public Shape() {
		
	}
//com argumentos
	public Shape(Color color) {
		super();
		this.color = color;
	}
	
//métodos get e set
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();

}
