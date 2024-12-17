package ify;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        String imie1, imie2, imie3, alf1 = "", alf2 = "", alf3 = "";

        System.out.println("Podaj pierwsze imię: ");
        imie1 = podaj.nextLine();

        System.out.println("Podaj drugie imię: ");
        imie2 = podaj.nextLine();

        System.out.println("Podaj trzecie imię: ");
        imie3 = podaj.nextLine();

        if (imie1.compareToIgnoreCase(imie2) < 0 && imie1.compareToIgnoreCase(imie3) < 0) {
            alf1 = imie1;
        }
        else if (imie2.compareToIgnoreCase(imie1) < 0 && imie2.compareToIgnoreCase(imie3) < 0) {
            alf1 = imie2;
        }
        else if (imie3.compareToIgnoreCase(imie1) < 0 && imie3.compareToIgnoreCase(imie2) < 0) {
            alf1 = imie3;
        }




        if (imie1.compareToIgnoreCase(imie2) < 0 && imie1.compareToIgnoreCase(imie3) > 0) {
            alf2 = imie1;
        }
        else if (imie2.compareToIgnoreCase(imie1) < 0 && imie2.compareToIgnoreCase(imie3) > 0) {
            alf2 = imie2;
        }
        else if (imie3.compareToIgnoreCase(imie1) < 0 && imie3.compareToIgnoreCase(imie2) > 0) {
            alf2 = imie3;
        }
        else if (imie1.compareToIgnoreCase(imie2) > 0 && imie1.compareToIgnoreCase(imie3) < 0) {
            alf2 = imie1;
        }
        else if (imie2.compareToIgnoreCase(imie1) > 0 && imie2.compareToIgnoreCase(imie3) < 0) {
            alf2 = imie2;
        }
        else if (imie3.compareToIgnoreCase(imie1) > 0 && imie3.compareToIgnoreCase(imie2) < 0) {
            alf2 = imie3;
        }



        if (imie1.compareToIgnoreCase(imie2) > 0 && imie1.compareToIgnoreCase(imie3) > 0) {
            alf3 = imie1;
        }
        else if (imie2.compareToIgnoreCase(imie1) > 0 && imie2.compareToIgnoreCase(imie3) > 0) {
            alf3 = imie2;
        }
        else if (imie3.compareToIgnoreCase(imie1) > 0 && imie3.compareToIgnoreCase(imie2) > 0) {
            alf3 = imie3;
        }

        System.out.println(alf1 + "\n" + alf2 + "\n" + alf3);

    }
}
