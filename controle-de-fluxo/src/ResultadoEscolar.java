// Condicional Composta + Condicional Encadeada

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        // condição ternária dentro de condição ternária
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Prova de recuperação" : "Reprovado";
        System.out.println(resultado);

        if(nota >= 7) { // condicional composta
            System.out.println("Aprovado");
        }
        else if (nota >= 5 && nota < 7) { // condicional encadeada
            System.out.println("Prova de recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
