import java.util.Random;


public class Main {
    public static void main(String[] args) {

        piRandom();
        eRandom();

    }

    private static int counter(){
        Random random = new Random();

        return random.nextInt(15);
    }

    private static void piRandom(){

        int counter = counter();

        System.out.println("ILOSC PI " + counter);
        for (int i = 0; i < counter ; i++) {

            int decimalPlaces = counter();
            System.out.println("LICZBA " + (i + 1));
            System.out.println("ILOSC MIEJSC PO PRZECINKU " + decimalPlaces);
            System.out.print(PiExtension.getPi(decimalPlaces));

        }

    }

    private static void eRandom() {
        int counter = counter();

        System.out.println("ILOSC EULEROW " + counter);
        for (int i = 0; i < counter ; i++) {

            int decimalPlaces = counter();
            System.out.println("LICZBA " + (i + 1));
            System.out.println("ILOSC MIEJSC PO PRZECINKU " + decimalPlaces);
            System.out.print(EulerExtension.getEuler(decimalPlaces));

        }

    }

}
