package org.teste;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro da sequencia de fibonacci: ");
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            if (isFibonacci(numero)) {
                System.out.println(STR."Você digitou \{numero} ele pertence a sequencia.");
                System.out.println(STR."O proximo número da sequencia será \{fibonacci(numero)}");
            } else {
                System.out.println(STR."O número \{numero} não pertence a sequcnia.");
            }
        } else {
            System.out.println("Você não digitou um número inteiro válido.");
        }

    }

    public static boolean isFibonacci(int numero) {

        int verificacao1 = 5 * numero * numero + 4;
        int verificacao2 = 5 * numero * numero - 4;
        return Math.sqrt(verificacao1) % 1 == 0 ||
                Math.sqrt(verificacao2) % 1 == 0;

    }

    public static int fibonacci(int numero) {

        int a = 0;
        int b = 1;

        while (b <= numero) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}
