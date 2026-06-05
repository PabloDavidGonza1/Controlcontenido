package method_Overloading_Overriding;

class Printer {
    public void print(String text) {
        System.out.println("Texto: " + text);
    }
    
    public void print(int number) {
        System.out.println("Número: " + number);
    }
}