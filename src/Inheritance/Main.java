package Inheritance;

public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();

        motorcycle.start();  // Método heredado
        motorcycle.wheelie(); // Método propio
    }
}