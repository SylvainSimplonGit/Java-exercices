/*
 La directive import suivante permet ensuite d'écrire Scanner sans
 avoir à écrire java.util.Scanner
*/
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ExoScanner {
    public static void main(String[] args) {
//        showMenu();
        readFile("inputFile.txt");
//        writeInFile("inputFile.txt");
//        showErrorDivideByZero();

    }

    public static void showErrorDivideByZero() {
        int i = 100;
        System.out.println(i / 0);

        /*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExoScanner.showErrorDivideByZero(ExoScanner.java:26)
	at ExoScanner.main(ExoScanner.java:21)
         */
    }

    public static void showErrorCallMethodOnRefObjectNOInit() {

    }

    public static void showMenu() {
        try {
            Scanner sc = new Scanner(System.in); // lecture depuis l'entrée standard (clavier)
            System.out.println("Saisissez un entier:");
            int i = sc.nextInt();
            System.out.println("Vous avez saisi: " + i);
            System.out.println("Saisissez un double (penser à la localisation!):");
            double d = sc.nextDouble(); // /!\ Si l'ordinateur est configuré en fr_FR, le séparateur décimal attendu est une virgule !
            System.out.println("Vous avez saisi: " + d);
            System.out.println("Saisissez une ligne de caractères");
            sc.nextLine(); // /!\ le dernier appel à nextDouble() n'avait pas consommé la fin de ligne !
            String line = sc.nextLine();
            System.out.println("Vous avez saisi: " + line);
        } catch (Exception e) {
            System.out.println("Une erreur est survenue !");
        }
    }

    public static void readFile(String pathFile) {
//        boolean returnState;
        try (Scanner sc = new Scanner(new File(pathFile))) {
            for(int i=0; sc.hasNextLine(); ++i){
                System.out.println("["+i+"]:"+ sc.nextLine());
            }
//            returnState = true;
        } catch (FileNotFoundException e) {
            System.out.println("Une erreur est survenue !\n" + e.getLocalizedMessage());
            readFile(showMenuException());
            //            returnState = false;
        }
    }

    public static void writeInFile(String pathFile) {
        PrintStream fileOut = null;
        try {
            fileOut = new PrintStream(new FileOutputStream(pathFile));
            fileOut.print("Hello ");
            fileOut.println("World !");
        } catch (FileNotFoundException e) {
            System.out.println("Une erreur est survenue !");
        } finally {
            fileOut.close();
        }
    }

    public static String showMenuException() {
        String result = "";
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Saisissez un nouveau nom de fichier :");
            result = sc.nextLine();
            System.out.println("Vous avez saisi: " + result);
        } catch (Exception e) {
            System.out.println("Une erreur est survenue !");
        }
        return result;
    }



}
