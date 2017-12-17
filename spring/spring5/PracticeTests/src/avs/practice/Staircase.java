package avs.practice;

//Consider a staircase of size :
//
//        #
//        ##
//        ###
//        ####
//        Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
//
//        Write a program that prints a staircase of size .
//
//        Input Format
//
//        A single integer, , denoting the size of the staircase.
//
//        Output Format
//
//        Print a staircase of size  using # symbols and spaces.
//
//        Note: The last line must have  spaces in it.
//
//        Sample Input
//
//        6
//        Sample Output
//
//        #
//        ##
//        ###
//        ####
//        #####
//        ######
//        Explanation
//
//        The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .



import java.util.Scanner;

public class Staircase {

    public static int result(int counter, int numberToPrint) {

        if (numberToPrint > counter) {
            return 0;
        } else {

            for (int i = counter; i > 0; i--) {

                if (i <= numberToPrint) {
                    System.out.print("#");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
            return result(counter, numberToPrint + 1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        int numberToPrint = 1;

        result(counter, numberToPrint);



//        Scanner sc = new Scanner(System.in);
//        int num  = Integer.parseInt(sc.nextLine());
//        for(int j=0;j<num;j++){
//            for(int i=1;i<=num;i++){
//                System.out.print(i<num-j?" ":"#");
//            }
//            System.out.println("");
//        }

    }
}
