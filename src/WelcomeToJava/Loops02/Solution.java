package WelcomeToJava.Loops02;

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;
            int multiplier = 2;
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    result += b;
                } else {
                    result += b * multiplier;
                    multiplier *= 2;
                }
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
