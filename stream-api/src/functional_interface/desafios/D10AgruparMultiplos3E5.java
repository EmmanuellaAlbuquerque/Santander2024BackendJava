package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D10AgruparMultiplos3E5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> impares = numeros.stream().filter(n -> n % 2 != 0).toList();
        List<Integer> multiplosDe3 = impares.stream().collect(Collectors.groupingBy(n -> n % 3 == 0)).get(true);
        List<Integer> multiplosDe5 = impares.stream().collect(Collectors.groupingBy(n -> n % 5 == 0)).get(true);
        List<Integer> multiplosDe3Ou5 = impares.stream().collect(Collectors.groupingBy((n -> (n % 3 == 0 || n % 5 == 0)))).get(true);

        System.out.println("Ímpares múltiplos de 3: " + multiplosDe3);
        System.out.println("Ímpares múltiplos de 5: " + multiplosDe5);
        System.out.println("Ímpares múltiplos de 3 ou 5 " + multiplosDe3Ou5);
    }
}

// Result: [3, 5, 9, 5, 3]