package ify;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        double masa, ciezar;

        System.out.println("Podaj masę obiektu: ");
        masa = podaj.nextDouble();
        podaj.nextLine();

        ciezar = masa * 9.8;

        if (ciezar > 1000) {
            System.out.println("Obiekt jest zbyt ciężki!");
        }
        else if (ciezar < 10) {
            System.out.println("Obiekt jest za lekki");
        }
        else {
            System.out.println("Masa obiektu wynosi " + ciezar + " niutonów.");
        }

    }
}
