package br.com.equipamento_multifuncional.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora {

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando por Scanner...");
    }
}
