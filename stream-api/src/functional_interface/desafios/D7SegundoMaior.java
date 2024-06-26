package functional_interface.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class D7SegundoMaior {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

//        List<Integer> ordenado  = numeros.stream().sorted().toList();
//        System.out.println(ordenado.get(ordenado.size() - 2));

        int segundoMaior = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst().get();
        System.out.println(segundoMaior);
    }
}

// Result: 9