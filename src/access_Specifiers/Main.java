package access_Specifiers;

public class Main {
    public static void main(String[] args) {
        GameProfile profile = new GameProfile("PlayerOne");

        profile.addPoints(50);

        System.out.println("Usuario: " + profile.username);
        System.out.println("Puntos: " + profile.getPoints());
    }
}