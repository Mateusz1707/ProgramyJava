package ify;

import java.util.Scanner;

public class Rzymski {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);
        String liczba;

        System.out.println("Podaj liczbę rzymską: ");
        liczba = podaj.nextLine();

        int wynik = 0;
        int[] dziesietne = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] rzymskie = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < dziesietne.length; i++) {
            while (liczba.indexOf(rzymskie[i]) == 0) {
                wynik += dziesietne[i];
                liczba = liczba.substring(rzymskie[i].length());
            }
        }

        System.out.println(wynik);

    }
}
