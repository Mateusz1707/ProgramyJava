package ify;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        double cena = 99, rabat = 0, liczba, suma;

        System.out.println("Podaj liczbę sztuk: ");
        liczba = podaj.nextDouble();
        podaj.nextLine();

        if (liczba >= 10 && liczba <= 19){
            rabat = 0.8;
            System.out.println("Twój rabat wynosi 20%!");
        }
        else if (liczba >= 20 && liczba <= 49){
            rabat = 0.7;
            System.out.println("Twój rabat wynosi 30%!");
        }
        else if (liczba >= 50 && liczba <= 99){
            rabat = 0.6;
            System.out.println("Twój rabat wynosi 40%!");
        }
        else if (liczba >= 100){
            rabat = 0.5;
            System.out.println("Twój rabat wynosi 50%!");
        }

        suma = cena * liczba * rabat;
        System.out.println("Kwota zakupu wynosi " + suma + " złotych.");

    }
}