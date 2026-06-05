package interfaces;

class Drone implements Flyable {
    @Override
    public void fly() {
        System.out.println("El dron está volando");
    }
}