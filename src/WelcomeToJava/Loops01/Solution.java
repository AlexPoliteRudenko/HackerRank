package WelcomeToJava.Loops01;

/*Given an integer, N , print its first 10 multiples.
Each multiple N x i (where 1 <= i <= 10) should be printed on a new line in the form:
N x i = result.*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}
