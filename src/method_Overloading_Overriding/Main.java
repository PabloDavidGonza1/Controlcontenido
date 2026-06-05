package method_Overloading_Overriding;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print("Java");
        printer.print(2026);

        Animal animal = new Parrot();
        animal.sound();
    }
}