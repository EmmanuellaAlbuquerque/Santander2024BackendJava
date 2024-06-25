package set.lista_de_tarefas;

public class Tarefa {
    private String descricao;
    private boolean foiConcluida;

    public Tarefa(String descricao, boolean foiConcluida) {
        this.descricao = descricao;
        this.foiConcluida = foiConcluida;
    }

    public boolean getFoiConcluida() {
        return foiConcluida;
    }

    public void setFoiConcluida(boolean foiConcluida) {
        this.foiConcluida = foiConcluida;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", foiConcluida=" + foiConcluida +
                '}';
    }
}
