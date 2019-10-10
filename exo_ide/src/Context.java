public class Context {
    public static void main(String[] args) {
        long res;

        res = factorial(4);
        System.out.println(res);

        res = fibonacci(4);
        System.out.println(res);

        int[] tab = {5, 1, 4, 2, 3};
        String result1 = arrayToString(tab);
        System.out.println("result1 : " + result1);

        double[] tab2 = {5L, 1L, 4L, 2L, 3L};
//        double[] tab2;
        String result2 = arrayToString(tab2);
        System.out.println("result2 : " + result2);

    }

    private static long factorial(long n) {
        if (n < 2) {
            return 1;
        }// on pourrait avoir un else
        long res = n * factorial(n - 1);
        return res;
    }

    private static long fibonacci(long n){
        if(n <= 2){
            return n;
        }// on pourrait avoir un else
        long res = fibonacci(n-1);
        res = res + fibonacci(n-2);
        return  res;
    }

    private static String arrayToString(int[] array) {
        String res = "[" + array[0];

        for( int i = 1; i != array.length; ++i) {
            res = res +  "," + array[i];
        }

        return res + "]";
    }

    private static String arrayToString(double[] array){
        String res = "[";
        for(double v : array){
            res += v + ",";
        }
        String res2 = res.substring(0, res.length()-1);
        return res2 +"]";
    }
}
