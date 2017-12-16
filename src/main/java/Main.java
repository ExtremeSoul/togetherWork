import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    private static final int NUMBER_COUNTER = 10;
    public static void main(String[] args) {

        piRandom();
    }

    public static void piRandom(){
        Random random = new Random(10);

        for (int i = 0; i < NUMBER_COUNTER ; i++) {

            int decimalPlaces = random.nextInt();

        }
    }
}
