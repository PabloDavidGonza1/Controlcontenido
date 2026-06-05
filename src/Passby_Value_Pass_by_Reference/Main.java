package Passby_Value_Pass_by_Reference;

public class Main {

    static void changeNumber(int number) {
        number = 500; // No cambia el original
    }

    static void changeWallet(Wallet wallet) {
        wallet.money = 500; // Cambia el objeto
    }

    public static void main(String[] args) {
        int number = 100;
        changeNumber(number);

        System.out.println("Número: " + number);

        Wallet wallet = new Wallet();
        wallet.money = 100;

        changeWallet(wallet);

        System.out.println("Dinero en billetera: " + wallet.money);
    }
}