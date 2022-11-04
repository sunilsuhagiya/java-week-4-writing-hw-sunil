package java_week4_hw_sunil;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 *   *
 *   * *
 *   * * *
 *   * * * *
 *   * * * * *
 */

public class Programme_15_LeftTriangleStar {
    public static void leftTriangleStar(int x){
        int i, j;
        for (i = 1; i <= x; i++){
            for (j = 1; j <= i; j++){
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows :  ");
        int a = scanner.nextInt();
        leftTriangleStar(a);
        // Closing scanner object
        scanner.close();
    }
}
