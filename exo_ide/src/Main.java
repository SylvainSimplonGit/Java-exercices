// Indentation shortcut Ctrl + Alt + L

// The Class Name must begin with a Uppercase letter
public class Main {

    // To change the class Name, use right click on class name
    // and click 'Refactor...', 'Rename ...' or MAJ + F6
    public static void main(String[] args) {
//        System.out.print("Hello ");
//        // Print with add end of line character
//        System.out.println(args[0]);
//        // Print without add end of line character
//        System.out.print(args[0]);
//
//        boolean formateur;
//        int age;
//        String prenom;
//
//        testArgs1();
//        testVariables();
//        affectVariables();
//        accessArray();
//        accessTwoArray();
//        testFloatTab();
//        testIntTab();
//        testArrayOfArray();
//        testString();
        exo6_5();
    }

    public static void testArgs1(String[] args) {
//        args[0] = 1;
     }

    public static void testVariables() {
        String formateur;
        float age;
        double age2;
        char prenom;

        formateur = "Bernard";
        // Float declaration must ended with f or F
        age = 44.2f;
        age2 = 44.2;
        prenom = 'a';
    }

    private static void affectVariables() {
        String[] arrayString = new String[2];
        int[] arrayInt = new int[2];
        float[] arrayFloat = new float[2];
        double[] arrayDouble = new double[2];

        // Show Type and address of array's reference
        System.out.println("arrayString :" + arrayString);
        System.out.println("arrayInt :" + arrayInt);
        System.out.println("arrayFloat :" + arrayFloat);
        System.out.println("arrayDouble :" + arrayDouble);
    }

    private static void accessArray() {
        int[] arrayInt = new int[2];
//        int[] arrayInt;

        System.out.println(arrayInt[1]);
        System.out.println("Longueur du tableau : " + arrayInt.length);
    }

    private static void accessTwoArray() {
        double[] arrayTab1 = new double[5];
        double[] arrayTab2 = arrayTab1;

        // arrayTab1 and arrayTab2 refers to the same reference of array
        // So if you change a value by call arrayTab2,
        // the value is also modified in arrayTab1
        System.out.println("arrayTab1[2] : " + arrayTab1[2]);
        arrayTab2[2] = 2.5;
        System.out.println("arrayTab2[2] : " + arrayTab2[2]);
        System.out.println("arrayTab1[2] : " + arrayTab1[2]);
    }

    private static void testFloatTab() {
        float[] tab1 = new float[5];
        System.out.println("tab1[1] : " + tab1[1]);
        f(tab1);
        System.out.println("after called function f : tab1[1] : " + tab1[1]);
    }

    private static void f(float[] tab2) {
        tab2[1] = -2.f;
    }

    private static void testIntTab() {
        int i1 = 0;
        System.out.println("i1 : " + i1);
        // With primitives variables, the reference doesn't match
        g(i1);
        System.out.println("after called function g : i1 : " + i1);
    }

    private static void g(int i2) {
        i2 = 2;
    }

    private static void testArrayOfArray() {
        int[][] data = {{1,0}, {-1, 0, 2}, {3, 4, 5}};
        // To access a variable, type index of the each array
        System.out.println("data[2][3] : " + data[2][2]);
    }

    private static void testString() {
        String s1 = "toto";
        testModifyString(s1);

        System.out.println("testString : " + s1);
    }

    private static void testModifyString(String s2) {
            s2 = "Salut " + s2;
            System.out.println("testModifyString : " + s2);
    }

    private static void exo6_5() {
        // If the operation begin by a string, the operand '+' concat all parameters
        System.out.println("score : " + 2 * 3);
        // If the operation begin by a numeric, the operand '+' concat all parameters
        System.out.println(2 * 3 + " points");
        // The order is very important, JAVA use the priority of operator
    }

}