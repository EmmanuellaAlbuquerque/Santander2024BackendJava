package set.conjunto_de_convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado convidado: convidadoSet) {
            if(convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }

        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet.toString());
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1111 );
        conjuntoConvidados.adicionarConvidado("Convidado 2", 5577);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 9743);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1111);
        System.out.println("Quantidade de Convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1111);
        conjuntoConvidados.exibirConvidados();
    }
}
