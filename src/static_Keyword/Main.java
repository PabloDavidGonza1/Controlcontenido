package static_Keyword;

public class Main {
    public static void main(String[] args) {
        new Pizza();
        new Pizza();
        new Pizza();

        System.out.println("Pizzas vendidas: " + Pizza.totalSold);
    }
}