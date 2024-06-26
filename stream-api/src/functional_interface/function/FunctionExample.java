package functional_interface.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> numerosDobrados = numeros.stream()
                .map(numero -> numero * 2)
                .toList();

        numerosDobrados.forEach(System.out::println);
    }
}