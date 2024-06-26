package map.estoque_de_produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;

        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto produto: estoqueProdutosMap.values()) {
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto produto: estoqueProdutosMap.values()) {
                if(produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto produto: estoqueProdutosMap.values()) {
                if(produto.getPreco() < menorPreco) {
                    produtoMaisBarato = produto;
                    menorPreco = produto.getPreco();
                }
            }
        }

        return produtoMaisBarato;
    }

    public Produto obterProdutoMaisCaroPorQuantidade() {
        double maiorValorTotalEstoque = Double.MIN_VALUE;
        Produto produtoMaisCaroPorQuantidade = null;

        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto produto: estoqueProdutosMap.values()) {
                double valorTotalProduto = produto.getQuantidade() * produto.getPreco();
                if (valorTotalProduto > maiorValorTotalEstoque) {
                    maiorValorTotalEstoque = valorTotalProduto;
                    produtoMaisCaroPorQuantidade = produto;
                }
            }
        }

        return produtoMaisCaroPorQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoque.adicionarProduto(9L, "Produto D", 7, 10.0);
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0);
        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto mais caro por Quantidade: " + estoque.obterProdutoMaisCaroPorQuantidade());
    }
}
