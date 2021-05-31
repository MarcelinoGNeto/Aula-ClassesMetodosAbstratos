package entities;

import entities.enums.Color;

public class Circle extends Shape {
//variáveis
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

//métodos getters e setters
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	
	@Override //cálculo da área do círculo
	public double area() {
		return Math.PI * radius * radius;
	}

}
