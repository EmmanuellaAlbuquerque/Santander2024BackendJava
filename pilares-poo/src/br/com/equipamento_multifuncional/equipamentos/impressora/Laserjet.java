package br.com.equipamento_multifuncional.equipamentos.impressora;

public class Laserjet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo por Laserjet...");
    }
}
