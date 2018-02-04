package avs.practice.algorithms;

import java.util.Scanner;

public class BigSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] values = new long[scanner.nextInt()];
        long total=0;
        for (int i = 0; i <= values.length - 1; i++) {
            values[i] = scanner.nextLong();

            //System.out.println(myARRAY[i]);
            total += values[i];

        }
        System.out.println(total);
    }
}
