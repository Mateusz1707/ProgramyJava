package ify;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        int liczba, sekundy, minuty, godziny, dni;

        System.out.println("Podaj liczbę sekund: ");
        liczba = podaj.nextInt();
        podaj.nextLine();

        if (liczba >= 60 && liczba < 3600){
            minuty = liczba / 60;
            sekundy = liczba - minuty*60;
            System.out.println(liczba + " sekund to " + minuty + " minut i " + sekundy + " sekund.");
        }
        else if (liczba >= 3600 && liczba < 86400) {
            godziny = liczba / 3600;
            minuty = (liczba - godziny*3600) / 60;
            sekundy = liczba - (minuty*60 + godziny*3600);
            System.out.println(liczba + " sekund to " + godziny + " godzin, " + minuty + " minut i " + sekundy + " sekund.");
        }

        else if (liczba >= 86400) {
            dni = liczba / 86400;
            godziny = (liczba - dni*86400) / 3600;
            minuty = (liczba - (dni*86400 + godziny*3600)) / 60;
            sekundy =  liczba - (dni*86400 + godziny*3600 + minuty*60);
            System.out.println(liczba + " sekund to " + dni + " dni, " + godziny + " godzin, " + minuty + " minut i " + sekundy + " sekund.");
        }

    }
}
