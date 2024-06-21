// Condicional Simples

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        
        double saldo = 25.0;
        double valorSolicitado = 17.0;
        // double valorSolicitado = 26.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Valor retirado com sucesso! Seu saldo atual é: " + saldo);
        }
        else {
            System.out.println("Você não tem saldo sufuciente! Seu saldo atual é " + saldo);
        }
    }
}
