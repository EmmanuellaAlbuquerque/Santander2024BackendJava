package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class D12ProdutoDeTodos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double produtoNumeros = numeros.stream().reduce((n1, n2) -> n1 * n2).get();
        System.out.println(produtoNumeros);
    }
}

// Result: 2.17728E8 - 217728000