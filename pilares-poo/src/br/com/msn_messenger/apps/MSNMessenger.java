package br.com.msn_messenger.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo MSN");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo MSN");
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagem pelo MSN");
    }
}

