package set.lista_de_tarefas;

import set.conjunto_de_convidados.Convidado;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        for(Tarefa tarefa: tarefasSet) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = tarefa;
                break;
            }
        }

        tarefasSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefasSet.toString());
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa tarefa: tarefasSet) {
            if(tarefa.getFoiConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tarefa: tarefasSet) {
            if(!tarefa.getFoiConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa tarefa: tarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setFoiConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefa tarefa: tarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setFoiConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");
        listaTarefas.adicionarTarefa("Tarefa 6");
        System.out.println("Quantidade de Tarefas: " + listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Tarefa 6");
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Tarefa 3");
        listaTarefas.marcarTarefaConcluida("Tarefa 5");
        System.out.println("Tarefas Concluídas: " + listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Tarefa 3");
        System.out.println("Tarefas Pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
