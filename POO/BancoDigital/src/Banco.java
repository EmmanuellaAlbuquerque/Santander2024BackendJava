import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas; // Composição

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void criarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void listarClientes() {
        contas.forEach(conta -> System.out.println("Número da Conta: " + conta.getNumero() + "\n"
                + "Cliente: " + conta.getCliente().getNome()));
    }
}
