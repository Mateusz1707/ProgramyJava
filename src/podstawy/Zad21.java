package podstawy;

import java.util.Scanner;

public class Zad21 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        double koncowePieniadze, poczatkowePieniadze, stopaOprocentowania, kapitalizacja, ileLat;

        System.out.println("Podaj kwotę pieniędzy początkowo zdeponowanej na koncie: ");
        poczatkowePieniadze = podaj.nextDouble();
        podaj.nextLine();

        System.out.println("Podaj stopę oprocentowania: ");
        stopaOprocentowania = podaj.nextDouble() / 100;
        podaj.nextLine();


        System.out.println("Podaj ile razy w roku odsetki są kapitalizowane (np. przy " +
                "kapitalizacji miesięcznej wpisz 12, a przy kapitalizacji kwartalnej — 4): ");
        kapitalizacja = podaj.nextDouble();
        podaj.nextLine();

        System.out.println("Podaj liczbę lat, przez jakie środki będą znajdować " +
                "się na koncie i generować odsetki: ");
        ileLat = podaj.nextDouble();
        podaj.nextLine();



        koncowePieniadze = poczatkowePieniadze * Math.pow((1 + stopaOprocentowania / kapitalizacja), (kapitalizacja * ileLat));
        System.out.println("Kwota jaka znajdzie się na koncie po określonej liczbie lat: " + koncowePieniadze);
    }
}
