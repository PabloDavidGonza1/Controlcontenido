package method_Chaining;

class Coffee {
    private String order = "Café";

    public Coffee addMilk() {
        order += " + leche";
        return this;
    }

    public Coffee addSugar() {
        order += " + azúcar";
        return this;
    }

    public void show() {
        System.out.println(order);
    }
}