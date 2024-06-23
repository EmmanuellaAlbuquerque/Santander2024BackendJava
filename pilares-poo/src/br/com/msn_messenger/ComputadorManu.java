package br.com.msn_messenger;

public class ComputadorManu {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        TelegramMessenger telegram = new TelegramMessenger();
        FacebookMessenger facebook = new FacebookMessenger();

        msn.enviarMensagem("Olá, tudo bem? (MSN)");
        telegram.enviarMensagem("Olá, tudo bem? (Telegram)");
        facebook.enviarMensagem("Olá, tudo bem? (Facebook)");
    }
}
