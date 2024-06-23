package br.com.sistema_autodromo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("5746754");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("543563");
        z400.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();
    }
}
