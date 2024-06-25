package list.soma_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> inteiros;

    public SomaNumeros() {
        this.inteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        inteiros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;

        for(Integer inteiro: inteiros) {
            soma += inteiro;
        }

        return soma;
    }

    public int encontrarMaiorNumero() {
        int max = Integer.MIN_VALUE;

        if(!inteiros.isEmpty()) {
            for(Integer inteiro: inteiros) {
                if (inteiro > max) {
                    max = inteiro;
                }
            }
        }
        else {
            System.out.println("A lista está vazia!");
        }

        return max;
    }

    public int encontrarMenorNumero() {
        int min = Integer.MAX_VALUE;

        if(!inteiros.isEmpty()) {
            for(Integer inteiro: inteiros) {
                if (inteiro < min) {
                    min = inteiro;
                }
            }
        }
        else {
            System.out.println("A lista está vazia!");
        }

        return min;
    }

    public void exibirNumeros() {
        System.out.println(inteiros.toString());
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(-5);

        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
