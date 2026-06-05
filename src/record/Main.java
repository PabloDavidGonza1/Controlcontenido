package record;

public class Main {
    public static void main(String[] args) {
    	recordposition player = new recordposition(10, 5);

        System.out.println("Posición X: " + player.x());
        System.out.println("Posición Y: " + player.y());
    }
}