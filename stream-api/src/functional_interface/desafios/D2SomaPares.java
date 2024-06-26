package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class D2SomaPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(somaPares);
    }
}

// Result: 34