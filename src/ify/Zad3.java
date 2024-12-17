package ify;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        double waga, wzrost, BMI;

        System.out.println("Podaj swoją wagę w kilogramach: ");
        waga = podaj.nextDouble();
        podaj.nextLine();

        System.out.println("Podaj swój wzrost w metrach: ");
        wzrost = podaj.nextDouble();
        podaj.nextLine();

        BMI = waga / Math.pow(wzrost, 2);

        if (BMI < 18.5) {
            System.out.println("Masz niedowagę!");
        } else if (BMI > 25) {
            System.out.println("Masz nadwagę!");
        } else if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("Masz optymalną wagę!");
        }

    }
}
