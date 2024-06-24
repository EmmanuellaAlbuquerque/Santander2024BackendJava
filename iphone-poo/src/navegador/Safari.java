package navegador;

public class Safari implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir página pelo Safari: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba pelo Safari...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página pelo Safari..");
    }
}
