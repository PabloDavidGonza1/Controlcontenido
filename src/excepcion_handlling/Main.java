package excepcion_handlling;

public class Main{

    public static void main(String[] args) {

        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
        }

        System.out.println("El programa sigue funcionando");
    }
}