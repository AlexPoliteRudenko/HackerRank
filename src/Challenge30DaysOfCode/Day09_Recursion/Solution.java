package Challenge30DaysOfCode.Day09_Recursion;

import java.util.Scanner;

public class Solution {
    private static int Factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Factorial(n));
    }
}
