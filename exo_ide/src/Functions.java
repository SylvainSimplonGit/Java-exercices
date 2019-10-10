public class Functions {

    public static void main(String[] args) {
//        testFunction();
        int a = 5;
        double inches = cmToInches(a);
        System.out.println(inches);
    }

    private static void testFunction() {

    }

    private static double cmToInches(double inCm){
        return inCm * 0.394;
    }
}
