import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExosShowing {
    public static void main(String[] args) {
        boolean quit = false;

        Scanner scInput;

        String[] arrayChoiceFunction = {
                "[1] => Calcul de TVA",
                "[2] => Est-ce que l'année est bissextile ?",
                "[3] => Calcul d'une factorielle",
                "[4] => Afficher une règle",
                "[5] => Afficher un rectangle",
                "[6] => est-ce que c'est un palindrome ?",
                "[7] => est-ce un nombre premier ?",
                "[8] => afficher tous les nombres premiers inférieurs à",
                "[9] => afficher la table de multiplication",
                "[0] => Sortie du programme"
        };

        if (args.length > 0) {
            boolean noValidFile = true;
            String nameFile = args[0];
            do {
                try (Scanner scFile = new Scanner(new File(nameFile))) {
                    for (int i = 0; (scFile.hasNextLine() && !quit); ++i) {
                        int choice = scFile.nextInt();
                        quit = executeFunctions(choice, scFile);
                    }
                    noValidFile = false;
                    quit = true;
                } catch (FileNotFoundException e) {
                    System.out.println("Une erreur est survenue !\n" + e.getLocalizedMessage());
                    scInput = new Scanner(System.in);
                    nameFile = getStringOfMenu("Veuillez entrer un nom de fichier qui existe :", scInput);
                    noValidFile = true;
                }
            } while (noValidFile);

        } else {
            while (!quit) {
//            clearConsole();
                scInput = new Scanner(System.in);
                int choice = getChoiceMenu(arrayChoiceFunction, scInput);
                quit = executeFunctions(choice, scInput);
            }
        }
        System.out.println("Sortie du programme normale...");
    }

    private static void clearConsole() {
        for (int i = 0; i != 300; ++i)
            System.out.println();
    }

    private static int getChoiceMenu(String[] entriesMenu, Scanner scInput) {
        boolean noValid = true;
        int entry = 0;

        while (noValid) {
            System.out.println("Choisissez la fonction que vous souhaitez executer");
            for (String menu : entriesMenu) {
                System.out.println(menu);
            }
            System.out.println("Votre choix :");
            try {
                entry = scInput.nextInt();
                noValid = false;
            } catch (Exception e) {
                scInput.nextLine();
                System.out.println("Une erreur est survenue !");
                noValid = true;
            }
        }

        return entry;
    }

    private static boolean executeFunctions(int choice, Scanner scInput) {
        boolean quit = false;
        switch (choice) {
            case 0:
                quit = true;
                break;
            case 1:
                getCalculateTVA(scInput);
                break;
            case 2:
                getLeapYear(scInput);
                break;
            case 3:
                getFactorial(scInput);
                break;
            case 4:
                getSlide(scInput);
                break;
            case 5:
                getRectangle(scInput);
                break;
            case 6:
                getPalindrome(scInput);
                break;
            case 7:
                getNumberFirst(scInput);
                break;
            case 8:
                getListNumbersFirst(scInput);
                break;
            case 9:
                getMultiplicationTable(scInput);
                break;
            default:

        }
        return quit;
    }

    private static int getIntOfMenu(String prompt, Scanner scInput) {
        boolean noValid = true;
        int choice = 0;

        while (noValid) {
            try {
                System.out.println(prompt);
                choice = scInput.nextInt();
                noValid = false;
            } catch (Exception e) {
                scInput.nextLine();
                System.out.println("Une erreur est survenue !");
                System.out.println(e.getLocalizedMessage());
                noValid = true;
            }
        }
        return choice;
    }

    private static long getLongOfMenu(String prompt, Scanner scInput) {
        boolean noValid = true;
        long choice = 0;

        while (noValid) {
            try {
                System.out.println(prompt);
                choice = scInput.nextLong();
                noValid = false;
            } catch (Exception e) {
                scInput.nextLine();
                System.out.println("Une erreur est survenue !");
                System.out.println(e.getLocalizedMessage());
                noValid = true;
            }
        }
        return choice;
    }

    private static float getFloatOfMenu(String prompt, Scanner scInput) {
        boolean noValid = true;
        float choice = 0;

        while (noValid) {
            try {
                System.out.println(prompt);
                choice = scInput.nextFloat();
                noValid = false;
            } catch (Exception e) {
                scInput.nextLine();
                System.out.println("Une erreur est survenue !");
                System.out.println(e.getLocalizedMessage());
                noValid = true;
            }
        }
        return choice;
    }

    private static String getStringOfMenu(String prompt, Scanner scInput) {
        boolean noValid = true;
        String choice = "";

        while (noValid) {
            try {
                System.out.println(prompt);
                choice = scInput.nextLine();
                noValid = false;
            } catch (Exception e) {
                scInput.nextLine();
                System.out.println("Une erreur est survenue !");
                System.out.println(e.getLocalizedMessage());
                noValid = true;
            }
        }
        return choice;
    }

    private static void getCalculateTVA(Scanner scInput) {
        System.out.println("Vous souhaitez faire un calcul de TVA");
        float prix = getFloatOfMenu("Quel est le prix du produit ?", scInput);
        float taux = getFloatOfMenu("Quel est le taux de la TVA ?", scInput);
        System.out.println("Le nouveau prix est : " + ExosFunctions.calculateTVA(prix, taux));
    }

    private static void getLeapYear(Scanner scInput) {
        System.out.println("Vous souhaitez vérifiez si une année est bissextile");
        int annee = getIntOfMenu("Quelle année voulez vous tester ?", scInput);
        if (ExosFunctions.isLeapYear(annee)) {
            System.out.println("L'année " + annee + " est bissextile.");
        } else {
            System.out.println("L'année " + annee + " n'est pas bissextile.");
        }
    }

    private static void getFactorial(Scanner scInput) {
        System.out.println("Vous souhaitez connaitre la factorielle d'un nombre");
        long number = getLongOfMenu("Quel nombre voulez vous tester ?", scInput);
        System.out.println("La factorielle de " + number + " est " + ExosFunctions.calculateFactorial(number));
    }

    private static void getSlide(Scanner scInput) {
        System.out.println("Vous souhaitez afficher une règle");
        int number = getIntOfMenu("Combien de graduation aura la règle ?", scInput);
        System.out.println(ExosFunctions.showSlide(number));
    }

    private static void getRectangle(Scanner scInput) {
        System.out.println("Vous souhaitez afficher un rectangle");
        int col = getIntOfMenu("Combien de colonnes aura le rectangle ?", scInput);
        int lig = getIntOfMenu("Combien de lignes aura le rectangle ?", scInput);
        System.out.println(ExosFunctions.showRectangle(col, lig));
    }

    private static void getPalindrome(Scanner scInput) {
        scInput.nextLine();
        System.out.println("Vous souhaitez savoir si la chaine est un palindrome");
        String chaine = getStringOfMenu("Quelle chaine voulez-vous tester ?", scInput);
        if (ExosFunctions.isPalindrome(chaine)) {
            System.out.println("La chaine " + chaine + " est un palidrome.");
        } else {
            System.out.println("La chaine " + chaine + " n'est pas un palindrome.");
        }
    }

    private static void getNumberFirst(Scanner scInput) {
        System.out.println("Vous souhaitez savoir si le nombre est premier");
        int number = getIntOfMenu("Quelle nombre voulez-vous tester ?", scInput);
        if (ExosFunctions.isNumberFirst(number)) {
            System.out.println("Le nombre " + number + " est un nombre premier.");
        } else {
            System.out.println("La nombre " + number + " n'est pas un nombre premier.");
        }
    }

    private static void getListNumbersFirst(Scanner scInput) {
        System.out.println("Vous souhaitez afficher la liste des nombres premiers");
        int number = getIntOfMenu("Quel sera le plus grand nombre ?", scInput);

        int[] numsFirst = ExosFunctions.getListNumFirst(number);
        if (numsFirst.length > 0) {
            System.out.println("Les nombres premiers inférieurs à " + number + " sont : ");

            System.out.print("\t");
            for (int n : numsFirst) {
                if (n > 2) {
                    System.out.print(n + ", ");
                } else if (n == 2) {
                    System.out.print(n + "\n");
                }
            }
        } else {
            System.out.println("Pas de nombres premiers inférieurs à " + number);
        }
    }

    private static void getMultiplicationTable(Scanner scInput) {
        System.out.println("Vous souhaitez afficher une table de multiplication");
        int col = getIntOfMenu("Combien de colonnes aura cette table ?", scInput);
        int lig = getIntOfMenu("Combien de lignes aura cette table ?", scInput);
        System.out.println(ExosFunctions.showMultiplicationTable(col, lig));
    }


}
