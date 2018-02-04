package avs.practice.java;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=  scanner.nextInt();

        if(number%2==0) {
            System.out.println("Not Weird");
        }else {
            System.out.println("Weird");
        }
    }
}
