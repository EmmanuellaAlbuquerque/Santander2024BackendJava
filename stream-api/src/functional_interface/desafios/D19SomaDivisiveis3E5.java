package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class D19SomaDivisiveis3E5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> divisiveis3E5 = numeros.stream().filter(n -> ((n % 3 == 0) || (n % 5 == 0))).toList();

        System.out.println(divisiveis3E5.stream().reduce(Integer::sum).get());
    }
}

// Result: 41