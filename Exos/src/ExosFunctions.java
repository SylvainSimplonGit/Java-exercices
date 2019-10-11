import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExosFunctions {

    public static void main(String[] args) {

    }

    public static void declareVariables() {
        String firstname = "Sylvain";
        String name = "GRIPPON";
        int age = 46;
        int height = 183;
        String explications = "Parce sue je veux coder comme un Dieu !!";
        int amountCount = 1000;
        boolean leapYear = false;
        String colorCard = "Black";
//        Color color = new Color();

        float prixTVA = 100;
        float tauxTVA = 20;
        float prixTTC;
    }

    public static float calculateTVA(float prix, float taux) {
        float tx = taux / 100;
        float result = prix + prix * tx;
        return (prix - prix * (taux / 100));
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? true : false;
    }

    public static long calculateFactorial(long number) {
        if (number > 1) {
            return number * calculateFactorial(number - 1);
        } else {
            return 1;
        }
    }

    public static String showSlide(int n) {
        String slide = "";
        if (n >= 0) {
            slide = "[";
            for (int i = 0; i != n; ++i) {
                slide += (((i + 1) % 5 == 0) && (i > 1)) ? "+" : "-";
            }
            slide += "]";
        } else {
            slide = "erreur";
        }
        return slide;
    }

    public static String showRectangle(int cols, int ligs) {
        String result = "";
        for (int lig = 0; lig != ligs + 2; ++lig) {
            result += (lig == 0 || lig == ligs + 1) ? showLineExtreme(cols + 2) + "\n" : showLineInternal(cols + 2) + "\n";
        }
        return result;
    }

    public static String showLineExtreme(int cols) {
        String result = "";
        for (int col = 0; col != cols; ++col) {
            result += (col == 0 || col == cols - 1) ? "+" : "-";
        }
        return result;
    }

    public static String showLineInternal(int cols) {
        String result = "";
        for (int col = 0; col != cols; ++col) {
            result += (col == 0 || col == cols - 1) ? "|" : " ";
        }
        return result;
    }

    public static boolean isPalindrome(String testString) {
        char[] arrayString = testString.toCharArray();
        int lenArray = arrayString.length;
        boolean result = true;
        int i = 0;
        while (result && i < lenArray) {
            result = (arrayString[i] == arrayString[(lenArray - 1) - i]) ? true : false;
            ++i;
        }
        return result;
    }

//    public static String purifyString(String testString) {
//        // Browse the string of characters
//
//        // Replace each character by his purified character
//
//    }

    public static boolean isNumberFirst(int num) {
        boolean result = true;
        int div = num - 1;
        if (num == 1) {
            result = false;
        } else if (num > 1) {
            while (result && div > 1) {
                result = (num % div == 0) ? false : true;
                --div;
            }
        } else {
            result = false;
        }
        return result;
    }

    public static int[] getListNumFirst(int num) {
        int[] result = new int[0];

        if (num > 1) {
            result = new int[num];
            int indice = 0;
            int nb = num;

            while (nb > 0) {
                if (isNumberFirst(nb)) {
                    result[indice] = nb;
                    ++indice;
                }
                --nb;
            }
        }
        return result;
    }

    public static int getValueMaxOfArray(int[] arrayNums) {
        int max = 0;
        for (int num : arrayNums) {
            max = (max < num) ? num : max;
        }
        return max;
    }

    public static int getValueMaxStringInArray(String[] arrayString) {
        int max = 0;
        for (String str : arrayString) {
            max = (max < str.length()) ? str.length() : max;
        }
        return max;
    }

    public static int getValueMaxOfArrayOfArray(int[][] arrayOfArrayNums) {
        int max = 0;
        for (int[] arrayNums : arrayOfArrayNums) {
            max = (max < getValueMaxOfArray(arrayNums)) ? getValueMaxOfArray(arrayNums) : max;
        }
        return max;
    }

    public static int getValueMaxStringInArrayOfArray(String[][] arrayString) {
        int max = 0;
        for (String[] str : arrayString) {
            max = (max < getValueMaxStringInArray(str)) ? getValueMaxStringInArray(str) : max;
        }
        return max;
    }

    public static int[][] getArrayOfMultiplicationTable(int lig, int col) {
        int[][] array = new int[lig][col];

        for (int l = 0; l != lig; ++l) {
            for (int c = 0; c != col; ++c) {
                array[l][c] = (l + 1) * (c + 1);
            }
        }
        return array;
    }

    public static String showTable(int lig, int col, int lengthMaxString) {
        String strResult = "";
        for (int i = 0; i != (lig * 2) + 1; ++i) {
            strResult += (i % 2 == 0) ? setGridLines(col, lengthMaxString, "middle") : setDataLine(col, lengthMaxString);
        }
        return strResult;
    }

    private static String setGridLines(int col, int lengthMax, String place) {
        char carTopLeft = (char) 9484;
        char carTopRight = (char) 9488;
        char carBotLeft = (char) 9492;
        char carBotRight = (char) 9496;

        char carTopMiddle = (char) 9516;
        char carBotMiddle = (char) 9524;
        char carMidLeft = (char) 9500;
        char carMidRight = (char) 9508;
        char carMidCross = (char) 9532;
        char carMidLineH = (char) 9472;

        String strLine = "";

        switch (place) {
            case "top": {
                strLine = setGridLine(col, lengthMax, carTopLeft, carTopRight, carTopMiddle, carMidLineH);
                break;
            }
            case "middle": {
                strLine = setGridLine(col, lengthMax, carMidLeft, carMidRight, carMidCross, carMidLineH);
                break;
            }
            case "bottom": {
                strLine = setGridLine(col, lengthMax, carBotLeft, carBotRight, carBotMiddle, carMidLineH);
                break;
            }
        }

        return strLine;
    }

    private static String setGridLine(int col, int lengthMax, char carBegin, char carEnd, char carCross, char carLine) {
        String strLine = "";
        for (int j = 0; j != (col * (lengthMax + 1)) + 1; ++j) {
            if (j == 0)
                strLine += carBegin;
            else if (j == (col * (lengthMax + 1)))
                strLine += carEnd;
            else
                strLine += (j % (lengthMax + 1) == 0) ? carCross : carLine;
        }
        return strLine + "\n";
    }

    private static String setDataLine(int col, int lengthMax) {
        char carMidLineV = (char) 9474;
        String strLine = "";

        for (int j = 0; j != (col * (lengthMax + 1)) + 1; ++j) {
            strLine += (j % (lengthMax + 1) == 0) ? carMidLineV : " ";
        }

        return strLine + "\n";
    }

    private static String setDataLine(int col, int lengthMax, int[] datas) {
        char carMidLineV = (char) 9474;
        String strLine = "";
        for (int data : datas) {
            String strData = "" + data;
            while (strData.length() < lengthMax) {
                strData = " " + strData;
            }
            strLine += carMidLineV + strData;
        }
        return strLine + carMidLineV + "\n";
    }

    public static String showTableOfDatas(int lig, int col, int lengthMaxString, int[][] datas) {
        String strResult = "";
        int curLig = 0;
        String type = "";

        for (int i = 0; i != (lig * 2) + 1; ++i) {
            if (i % 2 == 0) {
                if (i == 0)
                    type = "top";
                else if (i == (lig * 2))
                    type = "bottom";
                else
                    type = "middle";
                strResult += setGridLines(col, lengthMaxString, type);
            } else {
                strResult += setDataLine(col, lengthMaxString, datas[curLig]);
                ++curLig;
            }
        }
        return strResult;
    }

    public static String showMultiplicationTable(int lig, int col) {
        int[][] arrayOfMultiplicationTable = getArrayOfMultiplicationTable(lig, col);
        String valueMaxOfArrayOfArray = "" + getValueMaxOfArrayOfArray(arrayOfMultiplicationTable);
        int lengthValueMaxOfArrayOfArray = valueMaxOfArrayOfArray.length();

        return showTableOfDatas(lig, col, lengthValueMaxOfArrayOfArray, arrayOfMultiplicationTable);
    }

}
