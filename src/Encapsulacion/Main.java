package Encapsulacion;

	public class Main {
	    public static void main(String[] args) {
	        Cuenta c = new Cuenta(); // aquí funciona
	        c.setNombre("Pablo");
	        c.depositar(100);

	        System.out.println("Nombre: " + c.getNombre());
	        System.out.println("Saldo: " + c.getSaldo());
	    }
	}
