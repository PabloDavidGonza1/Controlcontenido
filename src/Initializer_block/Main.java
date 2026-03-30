package Initializer_block;

public class Main {

    String nombre;

    {
        nombre = "Sin nombre";
        System.out.println("Objeto creado");
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
    }

    public static void main(String[] args) {
        Main p = new Main();
        p.mostrar();
    }
}