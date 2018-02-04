package avs.practice.coinbase;

import java.util.Scanner;

public class InTheFuture {
    /*
     * Complete the function below.
     */
    static int minNum(int A, int K, int P) {
        int asha = A + P;
        int result = 0;


        if (A > K) {
            return -1;
        }

        if (asha >= K) {
            result = asha - K;
            if (result == 0) {
                return result + 2;
            }
        } else {
            result = K - asha;

            if (result == 0) {
                return result + 2;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int k = scanner.nextInt();
        int p = scanner.nextInt();

        System.out.println(minNum(a, k, p));

    }
}
