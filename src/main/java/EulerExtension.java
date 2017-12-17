public class EulerExtension {

    public static String getEuler(int x){

        double euler = Math.E;

        return String.format("%." + x + "f%n", euler);
    }
}
