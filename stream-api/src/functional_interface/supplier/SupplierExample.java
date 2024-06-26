package functional_interface.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        // With Lambda and Consumer
        listaSaudacoes.forEach(s -> System.out.println(s));
        // With Method Reference
        listaSaudacoes.forEach(System.out::println);
    }
}
