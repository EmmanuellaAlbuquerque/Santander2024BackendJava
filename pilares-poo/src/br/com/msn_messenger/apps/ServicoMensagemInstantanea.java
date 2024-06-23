package br.com.msn_messenger.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected abstract void salvarHistoricoMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet.");
    }
}
