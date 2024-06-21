package edu.manu.segundasemana;

public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Emmanuella";
        String segundoNome = "Albuquerque";
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}