package br.com.msn_messenger;

public class ServicoMensagemInstantanea {
    public void enviarMensagem(String msg) {
        validarConectadoInternet();
        System.out.println("Enviando mensagem...");
        System.out.println("Mensagem enviado com sucesso: " + msg);
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem...");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet...");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem...");
    }
}
