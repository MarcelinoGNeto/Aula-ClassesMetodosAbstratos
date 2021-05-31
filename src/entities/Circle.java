package entities;

import entities.enums.Color;

public class Circle extends Shape {
//vari�veis
	private Double radius;

//Construtor vazio
	public Circle() {
		super();
	}

//Construtor com argumentos (using Fields)
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

//m�todos getters e setters
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	
	@Override //c�lculo da �rea do c�rculo
	public double area() {
		return Math.PI * radius * radius;
	}

}
