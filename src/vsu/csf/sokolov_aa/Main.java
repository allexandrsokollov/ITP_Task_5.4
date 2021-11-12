package vsu.csf.sokolov_aa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int h = readIntFromConsole("Enter h ");
        printFigure(h);
    }

    /**
     * h >= 1
     * h is amount of lines and maximum amount of symbols in particular line
     */
    public static void printFigure(int h) {
        char symbol = 'a';

        for (int j = 1; j <= h; j++) {
            if (!isOdd(j)) {
                symbol++;
            }
            System.out.print(symbol);

            for (int i = 2; i <= j; i++) {
                if (symbol == 'a') {
                    symbol++;
                } else {
                    symbol--;
                }

                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    public static int readIntFromConsole(String message) {
        Scanner in = new Scanner(System.in);

        System.out.print("\n" + message + " ");
        return in.nextInt();
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }
}
