package list.lista_de_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa: tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList.toString());
    }

//    public void obterDescricoesTarefas() {
//        int index = 1;
//        for (Tarefa tarefa: tarefaList) {
//            System.out.println(index++ + "° - " + tarefa.getDescricao());
//        }
//        System.out.println("------------------------------------------");
//    }

    public static void main(String[] args) {
        ListaTarefas minhasTarefas = new ListaTarefas();

        minhasTarefas.adicionarTarefa("Estudar Java");
        minhasTarefas.adicionarTarefa("Fazer almoço");
        minhasTarefas.adicionarTarefa("Arrumar a casa");
        minhasTarefas.adicionarTarefa("Arrumar a casa");
        minhasTarefas.adicionarTarefa("Codar");
        minhasTarefas.adicionarTarefa("Descansar");
        System.out.println("Total de tarefas adicionadas: " + minhasTarefas.obterNumeroTotalTarefas());

        minhasTarefas.obterDescricoesTarefas();

        minhasTarefas.removerTarefa("Arrumar a casa");

        minhasTarefas.obterDescricoesTarefas();
    }
}
