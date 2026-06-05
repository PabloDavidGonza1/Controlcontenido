package static_vs_Dynamic_Binding;

class Child extends Parent {
    static void category() {
        System.out.println("Categoría hija");
    }

    @Override
    void message() {
        System.out.println("Mensaje hijo");
    }
}