package br.com.equipamento_multifuncional.equipamentos.multifuncional;

import br.com.equipamento_multifuncional.equipamentos.copiadora.Copiadora;
import br.com.equipamento_multifuncional.equipamentos.digitalizadora.Digitalizadora;
import br.com.equipamento_multifuncional.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {
    @Override
    public void copiar() {
        System.out.println("Copiando por Multi...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando por Multi...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo por Multi...");
    }
}
