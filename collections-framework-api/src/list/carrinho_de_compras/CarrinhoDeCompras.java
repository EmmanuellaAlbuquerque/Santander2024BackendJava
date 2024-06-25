package list.carrinho_de_compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itensCarrinho;

    public CarrinhoDeCompras() {
        this.itensCarrinho = new ArrayList<>();
    }

    public void adicionaItem(String nome, double preco, int quantidade) {
        itensCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item: itensCarrinho) {
            if (item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }

        itensCarrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0d;
        for (Item item: itensCarrinho) {
            double valorPorItem = item.getPreco() * item.getQuantidade();
            total += valorPorItem;
        }

        return total;
    }

    public void exibirItens() {
        System.out.println(itensCarrinho.toString());
    }

    public static void main(String[] args) {

        CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();

        meuCarrinho.adicionaItem("Computador Gamer", 4000.99, 1);
        meuCarrinho.adicionaItem("Chocolate Suflair", 10.00, 4);
        meuCarrinho.adicionaItem("Teclado Royal Kludge RK G68", 300.00, 1);

        meuCarrinho.exibirItens();
        System.out.println("Preço Total: " + meuCarrinho.calcularValorTotal());

        meuCarrinho.removerItem("Computador Gamer");

        meuCarrinho.exibirItens();
        System.out.println("Preço Total: " + meuCarrinho.calcularValorTotal());
    }
}
