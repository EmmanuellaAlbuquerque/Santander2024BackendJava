package br.com.sistema_autodromo;

public class Carro extends Veiculo {

    @Override
    public void ligar() {
        confereCambio();
        confereCombusticel();
        System.out.println("br.com.sistema_autodromo.Carro ligado!");
    }

    private void confereCombusticel() {
        System.out.println("Conferindo combustível...");
    }

    private void confereCambio() {
        System.out.println("Conferindo cambio em P...");
    }
}
