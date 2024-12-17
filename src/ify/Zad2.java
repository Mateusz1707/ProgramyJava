package ify;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        int dzien, miesiac, rok;

        System.out.println("Podaj numer dnia: ");
        dzien = podaj.nextInt();
        podaj.nextLine();

        System.out.println("Podaj numer miesiąca: ");
        miesiac = podaj.nextInt();
        podaj.nextLine();

        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        rok = podaj.nextInt();
        podaj.nextLine();

        if (dzien * miesiac == rok){
            System.out.println("Podana data jest magiczna!");
        } else {
            System.out.println("Podana data nie jest magiczna!");
        }

    }
}
