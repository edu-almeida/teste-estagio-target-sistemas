package org.teste;

public class Questao01 {

    // Soma tem o valor de 91 ao final do civlo.
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;
        while (k < indice) {
            k += 1;
            soma += k;
        }
        System.out.println(soma);
    }

}
