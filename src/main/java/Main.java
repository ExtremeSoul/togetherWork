import java.util.Random;


public class Main {
    public static void main(String[] args) {

        piRandom();

    }

    private static void piRandom(){
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
