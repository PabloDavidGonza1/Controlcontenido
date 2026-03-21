package Enums;

enum Dia {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES
}

public class Main {

    public static void main(String[] args) {
        Dia hoy = Dia.MIERCOLES;

        switch (hoy) {
            case LUNES:
                System.out.println("Hoy es lunes");
                break;
            case MARTES:
                System.out.println("Hoy es martes");
                break;
            case MIERCOLES:
                System.out.println("Hoy es miércoles");
                break;
            case JUEVES:
                System.out.println("Hoy es jueves");
                break;
            case VIERNES:
                System.out.println("Hoy es viernes");
                break;
        }

        System.out.println("Todos los días posibles:");
        for (Dia d : Dia.values()) {
            System.out.println(d);
        }
    }
}