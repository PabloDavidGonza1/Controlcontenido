package ejercico;

public class Vendedor extends Empleado{

	private double Comision;

	public Vendedor(String nombre, int salario, double comision) {
		super(nombre, salario);
		Comision = comision;
	}

	public double getComision() {
		return Comision;
	}

	public void setComision(double comision) {
		Comision = comision;
	}
	

	public double salarioTotal() {
		return this.Comision +  this.getSalario();
	}




	
}
