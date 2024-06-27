public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Manu");
        new Cliente("Venilton");
        Cliente clienteCamila = new Cliente("Camila");
        new Cliente("Gleyson");

        Conta contaPoupanca = new ContaPoupanca(cliente);
        Conta contaCorrente = new ContaCorrente(clienteCamila);

        Banco banco = new Banco();
        banco.criarConta(contaPoupanca);
        banco.criarConta(contaCorrente);
        banco.listarClientes();

        contaCorrente.depositar(100);
        contaCorrente.transferir(contaPoupanca, 50);

        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();
    }
}
