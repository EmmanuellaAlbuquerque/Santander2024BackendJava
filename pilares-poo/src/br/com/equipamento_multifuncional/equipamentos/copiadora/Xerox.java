package br.com.equipamento_multifuncional.equipamentos.copiadora;

public class Xerox implements Copiadora{
    @Override
    public void copiar() {
        System.out.println("Copiando por Xerox...");
    }
}
