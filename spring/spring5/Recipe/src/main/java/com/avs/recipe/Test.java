package com.avs.recipe;

import java.util.Scanner;

public class Test {

    public static void main(String args[]) {


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
