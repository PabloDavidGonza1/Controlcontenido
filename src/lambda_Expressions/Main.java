package lambda_Expressions;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Fernando", "Luis", "Sofía");

        names.forEach(name -> {
            if (name.length() <= 4) {
                System.out.println(name);
            }
        });
    }
}