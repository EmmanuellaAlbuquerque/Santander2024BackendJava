public class ChamadaDeAlunos {
    public static void main(String[] args) {
        String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos" };

        // FOR
        System.out.println("Chamada da Turma X");
        for (int contador = 0; contador < alunos.length; contador++) {
            System.out.println((contador + 1) + ". " + alunos[contador]);
        }

        // FOR EACH
        for(String aluno: alunos) {
            System.out.println(aluno);
        }
    }
}
