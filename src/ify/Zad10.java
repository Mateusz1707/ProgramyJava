package ify;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        double kalorie, tluszcz, kalorieTluszczu, procent;

        System.out.println("Podaj liczbę kalorii: ");
        kalorie = podaj.nextDouble();
        podaj.nextLine();

        System.out.println("Podaj liczbę gramów tłuszczu: ");
        tluszcz = podaj.nextDouble();
        podaj.nextLine();

        kalorieTluszczu = tluszcz * 9;
        procent = kalorieTluszczu / kalorie * 100;

        System.out.println("Procent kalorii pochodzących z tłuszczów: " + procent);

        if (procent < 30) {
            System.out.println("Produkt jest niskotłuszczowy!");
        }

        if (kalorieTluszczu > kalorie) {
            System.out.println("Dane wejściowe są nieprawidłowe!");
        }

    }
}
