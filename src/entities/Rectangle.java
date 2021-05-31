package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
//vari�veis
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

//m�todos get e set
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

	@Override //Calculo da �rea do ret�ngulo
	public double area() {
		return width * height;
	}

}
