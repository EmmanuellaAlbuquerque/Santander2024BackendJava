package br.com.msn_messenger;

import br.com.msn_messenger.apps.FacebookMessenger;
import br.com.msn_messenger.apps.MSNMessenger;
import br.com.msn_messenger.apps.ServicoMensagemInstantanea;
import br.com.msn_messenger.apps.TelegramMessenger;

public class ComputadorManu {
    public static void main(String[] args) {
// abstração
//        MSNMessenger msn = new MSNMessenger();
//        TelegramMessenger telegram = new TelegramMessenger();
//        FacebookMessenger facebook = new FacebookMessenger();
//
//        msn.enviarMensagem();
//        telegram.enviarMensagem();
//        facebook.enviarMensagem();
// polimorfismo
           ServicoMensagemInstantanea smi = null;
           String appEscolhido = "MSN";

           switch (appEscolhido) {
               case "MSN": {
                   smi = new MSNMessenger();
                   break;
               }
               case "Facebook": {
                   smi = new FacebookMessenger();
                   break;
               }
               case "Telegram": {
                   smi = new TelegramMessenger();
                   break;
               }
           }

           smi.enviarMensagem();
           smi.receberMensagem();
    }
}
