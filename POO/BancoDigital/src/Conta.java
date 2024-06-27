public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente; // Composição

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        else {
            System.out.println("Você não possui saldo suficiente para sacar!");
            System.out.println("Seu saldo atual é: " + saldo);
            return false;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if(this.sacar(valor)) {
            contaDestino.depositar(valor);
        }
        else {
            System.out.println("Não foi possível realizar a transfência!");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Títular: %s%n", this.cliente.getNome());
        System.out.printf("Agência: %d%n", this.getAgencia());
        System.out.printf("Número: %d%n", this.getNumero());
        System.out.printf("Saldo: %.2f%n", this.getSaldo());
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
