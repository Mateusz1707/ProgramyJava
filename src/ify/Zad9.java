package ify;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        double waga, odleglosc, stawka = 0, kwota;

        System.out.println("Podaj wagę przesyłki w kilogramach: ");
        waga = podaj.nextDouble();
        podaj.nextLine();

        System.out.println("Podaj odległość przesyłki w kilometrach: ");
        odleglosc = podaj.nextDouble();
        podaj.nextLine();

            if (waga <= 1) {
                stawka = 1.10;
            }
            else if (waga > 1 && waga <= 3) {
                stawka = 2.20;
            }
            else if (waga > 3 && waga <= 5) {
                stawka = 3.70;
            }
            else if (waga > 5) {
                stawka = 3.80;
            }

        if (odleglosc/500 <= 1) {
            kwota = stawka;
        }
        else {
            kwota = (stawka * Math.ceil(odleglosc/500)) *100/100;
        }

        System.out.println("Koszt przesyłki wyniesie " + kwota + " zł.");

    }
}
