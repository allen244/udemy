package avs.practice.algorithms;

import java.util.Scanner;

public class AppleAndOranges {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
        int appleCount = 0;
        int orangeCount = 0;


        for (int i = 0; i < apples.length; i++) {
            int appleThrown = apples[i];

            int appleValue = a + appleThrown;


            if (appleValue >= s && appleValue <= t) {
                appleCount++;
            }

        }

        for (int j = 0; j < oranges.length; j++) {
            int orangeThrown = oranges[j];

            int orangeValue = b + orangeThrown;


            if (orangeValue >= s && orangeValue <= t) {
                orangeCount++;
            }

        }


        System.out.println(appleCount+ " ");
        System.out.println(orangeCount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }

}
