package pass_by_value_Pass_by_reference;
public class Main {

    public static void cambiarValor(int x) {
        x = 50;
    }

    public static void main(String[] args) {

        int numero = 10;
        cambiarValor(numero);

        System.out.println("Valor final: " + numero);
    }
}