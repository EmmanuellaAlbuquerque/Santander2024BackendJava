package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class D13FiltrarNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int intervaloInicio = 5;
        int intervaloFim = 10;

        List<Integer> numerosIntervalo = numeros.stream()
                .filter(n -> (n > intervaloInicio && n < intervaloFim))
                .toList();

        System.out.println(numerosIntervalo);
    }
}

// Result: [6, 7, 8, 9]