package ejercico3;

public class Triangulo extends Figura{

	public Triangulo(String color, double base, double altura) {
		super(color, base, altura);
	}

	@Override
	public double area() {
		return this.base * this.altura /2;
	}

	
}
