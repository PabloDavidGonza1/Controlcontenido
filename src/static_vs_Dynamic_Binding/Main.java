package static_vs_Dynamic_Binding;

public class Main {
    public static void main(String[] args) {
        Parent object = new Child();

        object.category(); // Static binding
        object.message();  // Dynamic binding
    }
}