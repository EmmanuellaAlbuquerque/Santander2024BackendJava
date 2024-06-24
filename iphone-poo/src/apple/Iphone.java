package apple;

import aparelho.AparelhoTelefonico;
import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String processador;

    public Iphone(String modelo, String processador) {
        this.modelo = modelo;
        this.processador = processador;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando Música...");
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página..");
    }

    public void tirarFoto() {
        System.out.println("Tirando foto...");
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcessador() {
        return processador;
    }
}
