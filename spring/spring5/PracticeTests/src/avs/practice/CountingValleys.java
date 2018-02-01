package avs.practice;


//Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike, he took exactly  steps. For every step he took, he noted if it was an uphill or a downhill step. Gary's hikes start and end at sea level. We define the following terms:
//
//        A mountain is a non-empty sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
//        A valley is a non-empty sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
//        Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.
//
//        Input Format
//
//        The first line contains an integer, , denoting the number of steps in Gary's hike.
//        The second line contains a single string of  characters. Each character is  (where U indicates a step up and D indicates a step down), and the  character in the string describes Gary's  step during the hike.
//
//        Constraints
//
//        Output Format
//
//        Print a single integer denoting the number of valleys Gary walked through during his hik

import java.util.Scanner;

//Sample Input
//
//        8
//        UDDDUDUU
//        Sample Output
//
//        1
public class CountingValleys {

    public static void main(String[] args) {

        int seaLevel = 0;
        int belowSeaLevel = 0;
        int valley = 0;
        boolean start = false;

        Scanner scanner = new Scanner(System.in);
        int numberOfSteps = scanner.nextInt();
        String steps = scanner.next();
        char stepper[] = steps.toCharArray();

        //  for (int i = 0; i < 8; i++) {

        for (int j = 0; j < stepper.length; j++) {

            char step = stepper[j];

            if (step == 'U') {
                if (seaLevel == 0) {
                    start = true;
                }
                seaLevel++;
                belowSeaLevel--;

            }
            if (step == 'D') {
                if (belowSeaLevel == 0) {
                    start = false;
                }
                seaLevel--;
                belowSeaLevel++;

            }

            if (seaLevel == 0 && belowSeaLevel == 0 && start == false) {
                valley++;
            }

        }

        // }
        System.out.println(valley);


    }
}
