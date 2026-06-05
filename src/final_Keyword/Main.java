package final_Keyword;

public class Main {
    public static void main(String[] args) {
        final double TICKET_PRICE = 35.00; // No se puede cambiar

        int people = 4;
        double total = people * TICKET_PRICE;

        System.out.println("Total a pagar: Q" + total);
    }
}