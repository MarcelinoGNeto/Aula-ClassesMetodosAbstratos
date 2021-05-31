package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
//variáveis
	private Double width;
	private Double height;

//construtor vazio	
	public Rectangle() {
		super();
	}
	
//construtor com argumentos
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

//métodos get e set
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override //Calculo da área do retángulo
	public double area() {
		return width * height;
	}

}
