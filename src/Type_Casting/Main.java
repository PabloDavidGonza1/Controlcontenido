package Type_Casting;

public class Main {

	public static void main(String[] args) {
		int numero = 20;
        double resultado = numero;

        System.out.println("Entero a decimal: " + resultado);

        double precio = 19.99;
        int precioEntero = (int) precio;

        System.out.println("Decimal a entero: " + precioEntero);
	}

}
