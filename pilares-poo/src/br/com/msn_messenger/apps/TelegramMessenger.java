package br.com.msn_messenger.apps;

public class TelegramMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebenco Mensagem pelo Telegram");
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagem pelo Telegram");
    }
}
