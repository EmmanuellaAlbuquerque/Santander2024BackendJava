package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D11SomaDosQuadrados {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double somaDosQuadrados = numeros.stream().map(n -> Math.pow(n, 2)).reduce(Double::sum).get();

        System.out.println(somaDosQuadrados);
    }
}

// Result: 435.0