package ify;

public class Newag {
    public static void main(String[] args) {

        int day = 1;
        int month = 1;
        int year = 22;

        if((day >= 21 && month >= 11) || (day >= 21 && year >= 21) ||
                (month > 11 && year >= 21) || year > 21)

        {
            System.out.println("Pociąg nie jeździ");
        }
        else {
            System.out.println("Pociąg odjeżdża z toru 3 przy peronie 4");
        }
    }
}
