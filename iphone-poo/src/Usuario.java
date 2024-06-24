import apple.Iphone;
import apple.Iphone15;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone15 = new Iphone15("iPhone 15 Pro Max", "A17");

        iphone15.selecionarMusica("Bohemian Rhapsody - Queen");
        iphone15.tocar();
        iphone15.pausar();

        iphone15.ligar("993923443");
        iphone15.atender();
        iphone15.iniciarCorreioVoz();

        iphone15.adicionarNovaAba();
        iphone15.exibirPagina("https://www.mermaidchart.com");
        iphone15.atualizarPagina();

        iphone15.tirarFoto();
    }
}
