package ejercico;

public class Empleado {
	
	private String Nombre;
	private int Salario;
	
	

	public Empleado(String nombre, int salario) {
		super();
		Nombre = nombre;
		Salario = salario;
	}
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getSalario() {
		return Salario;
	}
	public void setSalario(int salario) {
		Salario = salario;
	}
	
	
	
	
}
