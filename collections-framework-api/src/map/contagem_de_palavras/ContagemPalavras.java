package map.contagem_de_palavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        contagemPalavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavrasMap);
    }

    public Map.Entry<String, Integer> encontrarPalavraMaisFrequente() {
        Integer maiorFrequencia = Integer.MIN_VALUE;
        String palavraMaisFrequente = null;

        for(Map.Entry<String, Integer> entry: contagemPalavrasMap.entrySet()) {
            if(entry.getValue() > maiorFrequencia) {
                palavraMaisFrequente = entry.getKey();
                maiorFrequencia = entry.getValue();
            }
        }

        if (palavraMaisFrequente != null) {
            return Map.entry(palavraMaisFrequente, maiorFrequencia);
        }
        else {
            return Map.entry("Nenhuma palavra adicionada", 0);
        }
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        contagemLinguagens.exibirContagemPalavras();

        System.out.println("A linguagem mais frequente é: " + contagemLinguagens.encontrarPalavraMaisFrequente());
    }
}
