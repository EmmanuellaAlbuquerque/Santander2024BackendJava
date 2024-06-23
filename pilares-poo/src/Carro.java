public class Carro extends Veiculo {

    public void ligar() {
        confereCambio();
        confereCombusticel();
        System.out.println("Carro ligado!");
    }

    private void confereCombusticel() {
        System.out.println("Conferindo combustível...");
    }

    private void confereCambio() {
        System.out.println("Conferindo cambio em P...");
    }
}
