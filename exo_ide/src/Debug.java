public class Debug {
    public static void main(String[] args) {
        double res = cmToInchesArea(10.5, 5.0);
        System.out.println(res);
    }

    private static double cmToInches(double inCm) {
        double inInches = inCm * 0.394;
        return inInches;
    }

    private static double cmToInchesArea(double widthInCm, double lengthInCm) {
        double widthInInches = cmToInches(widthInCm);
        double lengthInInches = cmToInches(lengthInCm);
        return widthInInches * lengthInInches;
    }
}
