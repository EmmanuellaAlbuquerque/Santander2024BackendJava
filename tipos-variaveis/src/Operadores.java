public class Operadores {
    public static void main(String[] args) {
        int numero = 5;

        numero = - numero; // -5
        numero = + numero; // -5
        numero = numero * -1; // 5

        // numero = numero + 1; // 6
        // numero++; // 6
        
        // System.out.println(numero++); // 5
        // System.out.println(numero); // 6

        System.out.println(++numero); // 6
        System.out.println(numero); // 6
    }
}