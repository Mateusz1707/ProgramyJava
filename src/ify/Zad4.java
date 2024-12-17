package ify;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        double wynik1, wynik2, wynik3, srednia;

        System.out.println("Podaj swój wynik z pierwszego testu: ");
        wynik1 = podaj.nextDouble();
        podaj.nextLine();

        System.out.println("Podaj swój wynik z drugiego testu: ");
        wynik2 = podaj.nextDouble();
        podaj.nextLine();

        System.out.println("Podaj swój wynik z trzeciego testu: ");
        wynik3 = podaj.nextDouble();
        podaj.nextLine();

        srednia = (wynik1 + wynik2 + wynik3) / 3;

        if (srednia <= 100 && srednia >= 90 ){
            System.out.println("Twój wynik to " + srednia + " więc dostałeś 5.");
        }
        else if (srednia <= 89 && srednia >= 80 ){
            System.out.println("Twój wynik to " + srednia + " więc dostałeś 4.");
        }
        else if (srednia <= 79 && srednia >= 70 ){
            System.out.println("Twój wynik to " + srednia + " więc dostałeś 3.");
        }
        else if (srednia <= 69 && srednia >= 60 ){
            System.out.println("Twój wynik to " + srednia + " więc dostałeś 2.");
        }
        else if (srednia < 60){
            System.out.println("Twój wynik to " + srednia + " więc dostałeś 1.");
        }

    }
}
