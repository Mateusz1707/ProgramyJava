public class Zad6 {
    public static void main(String[] args) {
        int szerokoscPom1i2 = 3;
        int dlugoscPom1i2 = 4;
        int szerokoscPom3 = 2;
        int dlugoscPom3 = 3;
        int szerokoscPom4 = 2;
        int dlugoscPom4 = 2;
        int powierzchniaPom1i2, powierzchniaPom3, powierzchniaPom4, powierzchniaMieszkania;

        powierzchniaPom1i2 = szerokoscPom1i2 * dlugoscPom1i2;
        powierzchniaPom3 = szerokoscPom3 * dlugoscPom3;
        powierzchniaPom4 = szerokoscPom4 * dlugoscPom4;
        powierzchniaMieszkania = 2*powierzchniaPom1i2 + powierzchniaPom3 + powierzchniaPom4;

        double na1osobe = (double) powierzchniaMieszkania / 4;
        System.out.println("Na jedną osobę przypada " + na1osobe + " metra kwadratowego.");
    }
}
