package Challenge30DaysOfCode.Day06_LetsReview;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        String S;
        for (int i = 0; i < T; i++) {
            S = in.next();
            char[] myCharArray = S.toCharArray();
            for (int j = 0; j < myCharArray.length; j += 2) {
                System.out.print(myCharArray[j]);
            }
            System.out.print(" ");
            for (int j = 1; j < myCharArray.length; j += 2) {
                System.out.print(myCharArray[j]);
            }
            System.out.println();
        }
    }
}
