package br.com.equipamento_multifuncional.equipamentos.impressora;

public class Deskjet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo por Deskjet...");
    }
}
