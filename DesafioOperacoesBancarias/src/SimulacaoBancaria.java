import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("BEM VINDO AO BANCO XXX - REALIZE SUAS OPERAÇÕES BANCÁRIAS");
            System.out.println("DIGITE A OPÇÃO DESEJADA:");
            System.out.println("1. DEPOSITAR");
            System.out.println("2. SACAR");
            System.out.println("3. CONSULTAR SALDO");
            System.out.println("4. ENCERRAR");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("DIGITE O VALOR DO DEPÓSITO:");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println(String.format("Saldo atual: %.1f", saldo));
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("DIGITE O VALOR DO SAQUE:");
                    double saque = scanner.nextDouble();
                    if ((saldo - saque) < 0) {
                      System.out.println("Saldo insuficiente.");
                    }
                    else {
                      saldo = saldo - saque;
                      System.out.println(String.format("Saldo atual: %.1f", saldo));
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println(String.format("Saldo atual: %.1f", saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}