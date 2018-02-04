package avs.practice.algorithms;

import java.util.Scanner;


//Given an array of  integers, can you find the sum of its elements?
//
//        Input Format
//
//        The first line contains an integer, , denoting the size of the array.
//        The second line contains  space-separated integers representing the array's elements.
//
//        Output Format
//
//        Print the sum of the array's elements as a single integer.
//
//        Sample Input
//
//        6
//        1 2 3 4 10 11
//        Sample Output
//
//        31

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myARRAY = new int[scanner.nextInt()];
        int total = 0;

        for (int i = 0; i <= myARRAY.length - 1; i++) {
            myARRAY[i] = scanner.nextInt();

            //System.out.println(myARRAY[i]);
            total += myARRAY[i];

        }

        System.out.println(total);
    }

}
