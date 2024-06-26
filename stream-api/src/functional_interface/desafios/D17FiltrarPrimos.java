package functional_interface.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class D17FiltrarPrimos {
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

        List<Integer> numerosPrimos = numeros.stream().filter(n -> D17FiltrarPrimos.isPrime(n)).toList();

        System.out.println(numerosPrimos);
    }
}

// Result: [2, 3, 5, 7, 5, 3]