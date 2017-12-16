import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    //private static final int NUMBER_COUNTER = 10;
    public static void main(String[] args) {

        piRandom();

    }

    public static void piRandom(){
        Random random = new Random();

        int numberCounter = random.nextInt(15);
        System.out.println("ILOSC PI " + numberCounter);
        for (int i = 0; i < numberCounter ; i++) {

            int decimalPlaces = random.nextInt(10);
            System.out.println("ILOSC MIEJSC PO PRZECINKU " + decimalPlaces);
            System.out.print(PiExtension.getPi(decimalPlaces));

        }
    }
}
