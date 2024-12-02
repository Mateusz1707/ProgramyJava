public class Zad3 {
    public static void main(String[] args) {
        int wiekszyTrojkat = 4;
        int mniejszyTrojkat = 3;

        for (int i=0; i<wiekszyTrojkat; i++) {
            for (int j=0; j<wiekszyTrojkat-1-i; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i=mniejszyTrojkat; i>0; i--) {
            for (int j=mniejszyTrojkat+1-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int k=0; k<2*i-1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
