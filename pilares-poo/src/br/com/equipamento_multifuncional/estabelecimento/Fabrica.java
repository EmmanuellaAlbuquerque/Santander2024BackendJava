package br.com.equipamento_multifuncional.estabelecimento;

import br.com.equipamento_multifuncional.equipamentos.copiadora.Copiadora;
import br.com.equipamento_multifuncional.equipamentos.digitalizadora.Digitalizadora;
import br.com.equipamento_multifuncional.equipamentos.impressora.Deskjet;
import br.com.equipamento_multifuncional.equipamentos.impressora.Impressora;
import br.com.equipamento_multifuncional.equipamentos.impressora.Laserjet;
import br.com.equipamento_multifuncional.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora1 = new Deskjet();
        impressora1.imprimir();

        Impressora impressora2 = new Laserjet();
        impressora2.imprimir();

        EquipamentoMultifuncional equipamento_multi = new EquipamentoMultifuncional();
        Impressora impressora_multi = equipamento_multi;
        Copiadora copiadora_multi = equipamento_multi;
        Digitalizadora digitalizadora_multi = equipamento_multi;
        impressora_multi.imprimir();
        copiadora_multi.copiar();
        digitalizadora_multi.digitalizar();
    }
}
