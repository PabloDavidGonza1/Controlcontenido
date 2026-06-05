package abstraction;

public class Main {
    public static void main(String[] args) {
        Instrument instrument = new Guitar();

        System.out.println("Instrumento: " + instrument.getName());
        instrument.play();
    }
}