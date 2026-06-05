package abstraction;

class Guitar extends Instrument {
    public Guitar() {
        super("Guitarra");
    }

    @Override
    public void play() {
        System.out.println("Sonando guitarra");
    }
}