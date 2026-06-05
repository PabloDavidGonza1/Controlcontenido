package method_Chaining;

public class Main {
    public static void main(String[] args) {
        new Coffee()
                .addMilk()
                .addSugar()
                .show();
    }
}