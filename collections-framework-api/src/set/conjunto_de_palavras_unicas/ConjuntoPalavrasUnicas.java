package set.conjunto_de_palavras_unicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasList;

    public ConjuntoPalavrasUnicas() {
        this.palavrasList = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasList.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        for(String p: palavrasList) {
            if(p.equalsIgnoreCase(palavra)) {
                palavraParaRemover = p;
                break;
            }
        }

        palavrasList.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasList.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasList.toString());
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Rails");
        conjuntoPalavrasUnicas.adicionarPalavra("Rails");
        conjuntoPalavrasUnicas.adicionarPalavra("Spring");
        conjuntoPalavrasUnicas.adicionarPalavra("Django");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("A palavra está presente? " + conjuntoPalavrasUnicas.verificarPalavra("Spring"));
        conjuntoPalavrasUnicas.removerPalavra("Django");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
