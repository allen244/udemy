package avs.practice.algorithms;

import java.text.DecimalFormat;
import java.util.Scanner;

//Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
//
//        Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
//
//        Input Format
//
//        The first line contains an integer, , denoting the size of the array.
//        The second line contains  space-separated integers describing an array of numbers .
//
//        Output Format
//
//        You must print the following  lines:
//
//        A decimal representing of the fraction of positive numbers in the array compared to its size.
//        A decimal representing of the fraction of negative numbers in the array compared to its size.
//        A decimal representing of the fraction of zeroes in the array compared to its size.
//        Sample Input
//
//        6
//        -4 3 -9 0 4 1
//        Sample Output
//
//        0.500000
//        0.333333
//        0.166667
//        Explanation
//
//        There are  positive numbers,  negative numbers, and  zero in the array.
//        The respective fractions of positive numbers, negative numbers and zeroes are ,  and , respectively.

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] results = new int[scanner.nextInt()];
        double pos = 0;
        double neg = 0;
        double zero = 0;
        DecimalFormat df = new DecimalFormat("#.000000");

        for (int i = 0; i < results.length; i++) {

            results[i] = scanner.nextInt();

            if (results[i] > 0) {
                pos++;

            } else if (results[i] < 0) {
                neg++;
            } else {
                zero++;
            }

        }

        String positive = df.format(pos / results.length);
        String negative = df.format(neg / results.length);
        String equa = df.format(zero / results.length);
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(equa);


    }
}
