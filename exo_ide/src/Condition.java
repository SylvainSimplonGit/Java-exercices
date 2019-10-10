public class Condition {

    public static void main(String[] args) {
//        testCondition();
//        testOperators();
//        testCompareArray();
//        testIf();
//        testOperatorTernaire();
//        testSwitch();
//        testWhile();
//        testFor();
//        numberDiviseByTwo();
        testLoopForAsPython();
    }

    private static void testCondition() {
        // 0.3 and (3*0.1) are float and the round is not the same
        System.out.println("0.3 == (3*0.1) : " + (0.3 == (3 * 0.1)));
        // 0.5 and 0.25 is power of 2 negative so the round is 0
        System.out.println("0.3 == (3*0.1) : " + (0.5 == (2 * 0.25)));
    }

    private static void testOperators() {
        int idx = -1;
        boolean[] data = {true, false, true};
        // if the 1st test is false with && operand, the rest of the condition doesn't evaluate
        boolean win = (idx >= 0) && data[idx];

//        boolean fail = data[idx] && (idx >= 0);
    }

    private static void testCompareArray() {
        int[] tab1 = new int[5];
        int[] tab2 = tab1;
        int[] tab3 = new int[5];
        // The references of tab1 and tab 2 are the same
        System.out.println("tab1 == tab2 : " + (tab1 == tab2));
        // The references of tab1 and tab3 are not the same but theirs values are equals
        System.out.println("tab1 == tab3 : " + (tab1 == tab3));
    }

    private static void testIf() {
        // Attention, do not type ';' after a block condition
        if (false) ;
        {
            System.out.println("Bloc True");
        }
//        else {
//            System.out.println("Bloc False");
//        }
    }

    private static void testOperatorTernaire() {
        boolean[] data = {true, false, false, true, true};
        int idx = -1;
        System.out.println((idx >= 0) ? data[idx] : false);
    }

    private static long arithmeticOp(long i, long j, char op) {
        long res = 0;
        switch (op) {
            case '-': {
                res = i - j;
                break;
            }
            case '+': {
                res = i + j;
                break;
            }
            case '*': {
                res = i * j;
                break;
            }
            case '/': {
                res = i / j;
                break;
            }
            default: {
                System.err.println("Operator '" + op + "' unknown !!!");
            }
        }
        return res;
    }

    private static void testSwitch() {
        long a = 25L;
        long b = 2L;
        char o = 'r';

        long value = arithmeticOp(a, b, o);
        System.out.println("Result : " + value);
    }

    private static void testWhile() {
        int v = 192;
        int compteur = 0;
        // If no {} we enter in infinity loop
        while (v % 2 == 0)
            System.out.println("le compteur vaut "+ compteur + " car "+ v+ " est (encore) pair");
            v = v / 2;
            compteur = compteur + 1;
        System.out.println("le nombre était divisible "+ compteur + " fois par 2");
    }

    private static void testFor() {
        for (int counter = 0; counter < 10; ++counter) {
            System.out.println(counter);
        }
    }

    private static void numberDiviseByTwo() {
        int num = 192;
        int counter = 0;

        while (num % 2 == 0) {
            num = num / 2;
            ++counter;
        }
        System.out.println("Nombre de fois que " + num + " est divisible par 2 : " + counter);
    }

    private static void testLoopForAsPython() {
        int[] data = {1, 2, 0, -1, 4, 8};
        for( int v : data ) {
            System.out.println(v);
        }
    }
}
