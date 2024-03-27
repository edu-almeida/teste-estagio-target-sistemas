package org.teste;

import java.util.ArrayList;

public class Questao03 {

    // testando as sequencias preenchendo todas as logicas com 10 números
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        ArrayList<Integer> e = new ArrayList<>();
        ArrayList<Integer> f = new ArrayList<>();
        a.add(1);
        b.add(2);
        c.add(0);
        d.add(4);
        e.add(1);
        f.add(2);

        int quantidadeElementos = 10;

        for (int index = 0; index < quantidadeElementos; index++) {
            a.add(logicaA(a.get(index)));
            b.add(logicaB(b.get(index)));
            c.add(logicaC(c.get(index)));
            d.add(logicaD(d.get(index)));
            e.add(logicaE(e.get(index)));
            f.add(logicaF(f.get(index)));
        }

        System.out.println(STR."Logica A: \{a}");
        System.out.println(STR."Logica B: \{b}");
        System.out.println(STR."Logica C: \{c}");
        System.out.println(STR."Logica D: \{d}");
        System.out.println(STR."Logica E: \{e}");
        System.out.println(STR."Logica F: \{f}");
    }


    public static int logicaA(int numero) {
        return numero + 2;
    }


    public static int logicaB(int numero) {
        return numero * 2;
    }


    public static int logicaC(int numero) {
        int baseAtual = (int) Math.sqrt(numero);
        return (int) Math.pow(baseAtual + 1, 2);
    }

    public static int logicaD(int numero) {
        int baseAtual = (int) Math.sqrt(numero);
        return (int) Math.pow(baseAtual + 1, 2);
    }

    public static int logicaE(int numero) {
        return Questao02.fibonacci(numero);
    }

    public static int logicaF(int numero) {
        if (numero == 2) {
            return numero + 8;
        } else if (numero == 10) {
            return numero + 2;
        } else if (numero == 12) {
            return numero + 4;
        } else {
            return numero + 1;
        }
    }
}
