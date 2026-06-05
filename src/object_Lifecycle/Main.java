package object_Lifecycle;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.work();

        robot = null; // El objeto ya no tiene referencia
        System.out.println("Robot fuera de uso");
    }
}