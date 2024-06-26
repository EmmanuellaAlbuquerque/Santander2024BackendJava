package functional_interface.desafios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class D5MediaMaioresQue5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

//        List<Integer> maioresQue5 = numeros.stream().filter(n -> n > 5).toList();
//        int result = maioresQue5.stream().reduce(0, Integer::sum) / maioresQue5.size();

        double result = numeros.stream()
                .filter(n -> n > 5)
                .collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(result);
    }
}

// Result: 8