package functional_interface.desafios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class D16AgruparParesEImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream().collect(Collectors.groupingBy(n -> n % 2 == 0)).get(true);
        List<Integer> numerosImpares = numeros.stream().collect(Collectors.groupingBy(n -> n % 2 != 0)).get(true);

        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números ímpares: " + numerosImpares);
    }
}

// Result: [2, 4, 6, 8, 10, 4] e [1, 3, 5, 7, 9, 5, 3]