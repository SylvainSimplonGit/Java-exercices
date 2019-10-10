public class Debug {
    public static void main(String[] args) {
        System.out.println("DEBUG");
//        debugDeclareVariables();
//        debugCalculTVA();
//        debugPremierInferieur();
//        debugYearLeap();
//        debugFactorielle();
//        debugRegle();
//        debugRectangle();
//        debugPalindrome();
//        debugNombreProduit();
//        debugArrayMax();
//        debugArrayMaxString();
//        debugArrayMaxOfArray();
//        debugArrayMaxStringOfArray();
//        debugShowTable();
//        debugEmptyTable();
        debugMultiplicationTable();

    }

    private static void debugDeclareVariables() {
        ExosIntro.declareVariables();
    }

    private static void debugCalculTVA() {
        System.out.println("DEBUG : Calcul TVA");
        System.out.println("calculateTVA : " + ExosIntro.calculateTVA(100,20));
    }

    private static void debugYearLeap() {
        System.out.println("DEBUG : Calcul Année bissextile");
        int[] years_leap = {1584,1588,1592,1596,1600,1604,1608,1612,1616,1620,
                1624,1628,1632,1636,1640,1644,1648,1652,1656,1660,
                1664,1668,1672,1676,1680,1684,1688,1692,1696,
                1704,1708,1712,1716,1720,1724,1728,1732,1736,1740,
                1744,1748,1752,1756,1760,1764,1768,1772,1776,1780,
                1784,1788,1792,1796,
                1804,1808,1812,1816,1820,1824,1828,1832,1836,1840,
                1844,1848,1852,1856,1860,1864,1868,1872,1876,1880,
                1884,1888,1892,1896,1904,1908,1912,1916,1920,
                1924,1928,1932,1936,1940,1944,1948,1952,1956,1960,
                1964,1968,1972,1976,1980,1984,1988,1992,1996,2000
        };
        int[] years_no_leap = {1585, 1586, 1587, 1589, 1590, 1591, 1700, 1800, 1900, 2100, 2200, };

        System.out.println("Début Analyse Année Bissextile : ");
        for (int y : years_leap) {
            if (!ExosIntro.isLeapYear(y)) {
                System.out.println("calculateLeap de " + y + " : " + ExosIntro.isLeapYear(y));
            }
        }
        System.out.println("Analyse Année Bissextile sur " + years_leap.length + " années !");

        System.out.println("Début Analyse Année non Bissextile : ");
        for (int y : years_no_leap) {
            if (ExosIntro.isLeapYear(y)) {
                System.out.println("calculateLeap de " + y + " : " + ExosIntro.isLeapYear(y));
            }
        }
        System.out.println("Analyse Année non Bissextile sur " + years_no_leap.length + " années !");
    }

    private static void debugFactorielle() {
        System.out.println("DEBUG : Calcul factorielle");
        int[] numbers = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] factorials = {1, 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800};

        for (int i = 0; i != numbers.length; ++i) {
            if (factorials[i] != ExosIntro.calculateFactorial(numbers[i])) {
                System.out.println("La function calculateFactorial(" + numbers[i] + ") renvoie une mauvaise valeur : " +  ExosIntro.calculateFactorial(numbers[i]));
            }
        }
    }

    private static void debugRegle() {
        System.out.println("DEBUG : Affichage Règle");
        int[] datas = {-1, 0, 1, 2, 5, 6, 10, 12};
        String[] datas_result = {"erreur", "[]", "[-]", "[--]", "[----+]", "[----+-]", "[----+----+]", "[----+----+--]"};

        for (int i = 0; i != datas.length; ++i) {
            if (!datas_result[i].equalsIgnoreCase(ExosIntro.showSlide(datas[i]))) {
                System.out.println("Affichage KO de la règle de " + datas[i] + " graduations : " + ExosIntro.showSlide(datas[i]));
            } else {
                System.out.println("Affichage OK de la règle de " + datas[i] + " graduations : " + ExosIntro.showSlide(datas[i]));
            }
        }
    }

    private static void debugRectangle() {
        System.out.println("DEBUG : Affichage Rectangle");
        int[][] rectangle = {{1,1}, {2, 1}, {3,2}};

        for (int i = 0; i != rectangle.length; ++i) {
            System.out.println(ExosIntro.showRectangle(rectangle[i][0],rectangle[i][1]));
        }
    }

    private static void debugPalindrome() {
        System.out.println("DEBUG : Affichage Palindrome");
        String[] palindromes = {"anna", "radar", "rotor", "kayak", "été", "ici", "tôt", "rêver", "réifier", "ressasser"};

        for (int i = 0; i != palindromes.length; ++i) {
            if (ExosIntro.isPalindrome(palindromes[i])) {
                System.out.println(palindromes[i] + " est un palidrome !");
            } else {
                System.out.println(palindromes[i] + " n'est pas un palidrome !");
            }
        }
    }

    private static void debugNombreProduit() {
        System.out.println("DEBUG : Affichage nombres premiers");
        int[] nums = {-3, 0, 1, 2, 4, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        for (int nb : nums) {
            if (ExosIntro.isNumberFirst(nb)) {
                System.out.println("Le nombre " + nb + " est un nombre premier !");
            } else {
                System.out.println("Le nombre " + nb + " n'est pas un nombre premier !");
            }
        }
    }

    private static void debugPremierInferieur() {
        System.out.println("DEBUG : Affichage nombres premiers inférieurs");
        int[] listNums = {-3, 0, 1, 2, 4, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        for (int nb : listNums) {
            int[] numsFirst = ExosIntro.getListNumFirst(nb);
            if (numsFirst.length > 0) {
                System.out.println("Les nombres premiers inférieurs à " + nb + " sont : ");

                System.out.print("\t");
                for (int n : numsFirst) {
                    if (n > 2) {
                        System.out.print(n + ", ");
                    } else if (n == 2) {
                        System.out.print(n + "\n");
                    }
                }
            } else {
                System.out.println("Pas de nombres premiers inférieurs à " + nb);
            }
        }
    }

    private static void debugArrayMax() {
        System.out.println("DEBUG : Affichage de la valeur MAX d'un tableau");

        int[][] listNums = {{0,1,14,21,10}, {-1,80,1500,14}};
        int[] listMax = {21,1500};

        for (int i = 0; i != listNums.length; ++i) {
            if (ExosIntro.getValueMaxOfArray(listNums[i]) == listMax[i]) {
                System.out.println("Le maximum du tableau " + i + " est bien " + listMax[i]);
            } else {
                System.out.println("Le maximum du tableau " + i + " n'est pas " + listMax[i] + " !");
            }
        }
    }

    private static void debugArrayMaxString() {
        System.out.println("DEBUG : Affichage de la chaine la plus longue");

        String[][] listString = {{"Écrire","un","programme","qui","permette"},{"d'afficher","la","taille","de","la","chaîne"},{"de","caractères","la","plus","longue"},{"d'un","tableau","de","chaînes","de","caractères"}};
        int[] lengthMax = {9, 10, 10, 10};

        for (int i = 0; i != listString.length; ++i) {
            if (ExosIntro.getValueMaxStringInArray(listString[i]) == lengthMax[i]) {
                System.out.println("Taille du mot le plus long du tableau " + i + " : " + ExosIntro.getValueMaxStringInArray(listString[i]));
            } else {
                System.out.println("Problème sur la taille du mot le plus long du tableau " + i + " : " + ExosIntro.getValueMaxStringInArray(listString[i]));
            }
        }
    }

    private static void debugArrayMaxOfArray() {
        System.out.println("DEBUG : Affichage de la valeur MAX d'un tableau de tableau");

        int[][][] listNums = {{{0,1,14,21,10}, {-1,80,1500,14}}, {{0,1,14,21,10}, {-1,80,14}}};
        int[] listMax = {1500, 80};

        for (int i = 0; i != listNums.length; ++i) {
            if (ExosIntro.getValueMaxOfArrayOfArray(listNums[i]) == listMax[i]) {
                System.out.println("Le maximum du tableau " + i + " est bien " + listMax[i]);
            } else {
                System.out.println("Le maximum du tableau " + i + " n'est pas " + listMax[i] + " !");
            }
        }
    }

    private static void debugArrayMaxStringOfArray() {
        System.out.println("DEBUG :  Affichage de la chaine la plus longue d'un tableau de tableau");

        String[][][] listString = {{{"Écrire","un","programme","qui","permette"},{"d'afficher","la","taille","de","la","chaîne"}},{{"de","caractères","la","plus","longue"},{"d'un","tableau","de","chaînes","de","caractères"}}};
        int[] listMax = {10, 10};

        for (int i = 0; i != listString.length; ++i) {
            if (ExosIntro.getValueMaxStringInArrayOfArray(listString[i]) == listMax[i]) {
                System.out.println("Taille du mot le plus long du tableau " + i + " : " + ExosIntro.getValueMaxStringInArrayOfArray(listString[i]));
            } else {
                System.out.println("Problème sur la taille du mot le plus long du tableau " + i + " : " + ExosIntro.getValueMaxStringInArrayOfArray(listString[i]));
            }
        }
    }

    private static void debugShowTable() {
        int[][] datas = {{3, 4}, {5, 6}, {10, 10}};

        for (int[] data : datas) {
            int[][] matrix = ExosIntro.getArrayOfMultiplicationTable(data[0],data[1]);
            System.out.println("Table de " + data[0] + " par " + data[1]);
            for (int i = 0; i != matrix.length; ++i) {
                int[] ligne = matrix[i];
                for (int j = 0; j != ligne.length; ++j) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("\n");
            }
            System.out.println();
        }
    }

    private static void debugEmptyTable() {
        System.out.println(ExosIntro.showTable(3,4, 2));
    }

    private static void debugMultiplicationTable() {
        int[][] datas = {{3, 4}, {5, 6}, {10, 10}};
        for (int[] data : datas) {
            System.out.println(ExosIntro.showMultiplicationTable(data[0],data[1]));
        }
    }
}
