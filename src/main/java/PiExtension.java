import java.util.IllegalFormatPrecisionException;

public class PiExtension {


    public static String getPi(int x) {

        double pi = Math.PI;

        return String.format("%."+ x +"f%n", pi);
    }

}
