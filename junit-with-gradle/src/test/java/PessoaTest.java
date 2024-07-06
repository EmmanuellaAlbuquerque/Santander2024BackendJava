import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(4, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDate.of(2000, 1, 1));
        Pessoa joao = new Pessoa("João", LocalDate.of(LocalDate.now().getYear(), 1, 1));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
