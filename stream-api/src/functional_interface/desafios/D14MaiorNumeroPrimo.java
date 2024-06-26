package functional_interface.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class D14MaiorNumeroPrimo {
    public static boolean isPrime(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if((numero % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream().filter(n -> D14MaiorNumeroPrimo.isPrime(n)).toList();

        System.out.println(numerosPrimos.stream().max(Comparator.naturalOrder()).get());
    }
}

// Result: 7