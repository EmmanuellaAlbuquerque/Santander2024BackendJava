package set.agenda_de_contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet.toString());
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contato: contatoSet) {
            if(contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato contato: contatoSet) {
            if(contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Manu", 123456);
        agendaContatos.adicionarContato("Camila", 999674567);
        agendaContatos.adicionarContato("Camila Cavalcante", 978674567);
        agendaContatos.adicionarContato("Camila DIO", 992674567);
        agendaContatos.adicionarContato("Camila", 999674567);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
        System.out.println(agendaContatos.atualizarNumeroContato("Manu", 993713467));
        agendaContatos.exibirContatos();
    }
}