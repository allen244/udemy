package avs.practice.datastructures;

import java.util.Scanner;

public class ArraysDS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myarray = new int[scanner.nextInt()];

        for (int i = 0; i < myarray.length; i++) {
            myarray[i] = scanner.nextInt();
        }

        int sizer = myarray.length - 1;

        for (int j = sizer; j >= 0; j--) {

            System.out.print(myarray[j] + " ");

        }

    }
}
