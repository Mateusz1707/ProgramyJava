import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        int szerokoscPom1;
        int dlugoscPom1;
        int szerokoscPom2;
        int dlugoscPom2;
        int szerokoscPom3;
        int dlugoscPom3;
        int szerokoscPom4;
        int dlugoscPom4;
        int powierzchniaPom1, powierzchniaPom2, powierzchniaPom3, powierzchniaPom4, powierzchniaMieszkania;

        System.out.println("Podaj szerokość pomieszczenia 1: ");
        szerokoscPom1 = podaj.nextInt();
        podaj.nextLine();

        System.out.println("Podaj długość pomieszczenia 1: ");
        dlugoscPom1 = podaj.nextInt();
        podaj.nextLine();

        System.out.println("Podaj szerokość pomieszczenia 2: ");
        szerokoscPom2 = podaj.nextInt();
        podaj.nextLine();

        System.out.println("Podaj długość pomieszczenia 2: ");
        dlugoscPom2 = podaj.nextInt();
        podaj.nextLine();

        System.out.println("Podaj szerokość pomieszczenia 3: ");
        szerokoscPom3 = podaj.nextInt();
        podaj.nextLine();

        System.out.println("Podaj długość pomieszczenia 3: ");
        dlugoscPom3 = podaj.nextInt();
        podaj.nextLine();

        System.out.println("Podaj szerokość pomieszczenia 4: ");
        szerokoscPom4 = podaj.nextInt();
        podaj.nextLine();

        System.out.println("Podaj długość pomieszczenia 4: ");
        dlugoscPom4 = podaj.nextInt();
        podaj.nextLine();



        powierzchniaPom1 = szerokoscPom1 * dlugoscPom1;
        powierzchniaPom2 = szerokoscPom2 * dlugoscPom2;
        powierzchniaPom3 = szerokoscPom3 * dlugoscPom3;
        powierzchniaPom4 = szerokoscPom4 * dlugoscPom4;
        powierzchniaMieszkania = powierzchniaPom1 + powierzchniaPom2 + powierzchniaPom3 + powierzchniaPom4;

        System.out.println("Powierzchnia pomieszczenia 1: " + powierzchniaPom1);
        System.out.println("Powierzchnia pomieszczenia 2: " + powierzchniaPom2);
        System.out.println("Powierzchnia pomieszczenia 3: " + powierzchniaPom3);
        System.out.println("Powierzchnia pomieszczenia 4: " + powierzchniaPom4);
        System.out.println("Powierzchnia całego mieszkania: " + powierzchniaMieszkania);
    }
}
