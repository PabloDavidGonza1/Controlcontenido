package nested_Classes;

class Phone {

    class Battery {
        int percentage = 90;
    }

    public void showBattery() {
        Battery battery = new Battery();
        System.out.println("Batería: " + battery.percentage + "%");
    }
}
