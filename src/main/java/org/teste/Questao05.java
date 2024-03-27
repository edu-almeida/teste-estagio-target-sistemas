package org.teste;

import java.util.Scanner;


public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        System.out.println(STR."String invertida: \{stringInversa(scanner.nextLine())}");
    }

    public static String stringInversa(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = string.length() - 1;
        while (i >= 0) {
            stringBuilder.append(string.charAt(i));
            i--;
        }
        return stringBuilder.toString();
    }
}

