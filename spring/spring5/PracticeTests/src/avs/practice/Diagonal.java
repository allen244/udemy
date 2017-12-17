package avs.practice;


//Input : mat[][] = 11 2 4
//        4 5 6
//        10 8 -12
//        Output : 15
//        Sum of primary diagonal = 11 + 5 + (-12) = 4.
//        Sum of primary diagonal = 4 + 5 + 10 = 19.
//        Difference = |19 - 4| = 15.
//
//
//        Input : mat[][] = 10 2
//        4 5
//        Output : 7

import java.util.Scanner;

public class Diagonal {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizer = scanner.nextInt();
        int[][] matrix = new int[sizer][sizer];
        int d1 = 0;
        int d2 = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int col = 0; col < matrix[i].length; col++) {
                matrix[i][col] = scanner.nextInt();

                if (i == col) {
                    d1 += matrix[i][col];
                }

                if (i == sizer - col - 1) {
                    d2 += matrix[i][col];
                }

            }

        }
        System.out.println(Math.abs(d1 - d2));

    }


}

