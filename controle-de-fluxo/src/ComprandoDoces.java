import java.util.concurrent.ThreadLocalRandom;

public class ComprandoDoces {
    public static void main(String[] args) {
        double mesada = 50.0;

        System.out.println("Mesada Inicial: " + mesada);

        while (mesada > 0) {
            double valorDoce = generateRandomValue();

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho!");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada Final: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces. :cryface:");
    }

    private static double generateRandomValue() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
