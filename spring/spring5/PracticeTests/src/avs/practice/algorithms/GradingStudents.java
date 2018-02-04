package avs.practice.algorithms;

import java.util.Scanner;

public class GradingStudents {

    static int[] solve(int[] grades) {
        int[] results = new int[grades.length];
        // Complete this function
        for (int i = 0; i < grades.length; i++) {

            int grade = grades[i];
            int test = grade % 5;

            if (grade < 38) {
                results[i] = grade;
                continue;
            }
            if (test >= 3) {
                results[i] = grade + 5 - test;

            } else {
                results[i] = grade;
            }

        }
        return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
