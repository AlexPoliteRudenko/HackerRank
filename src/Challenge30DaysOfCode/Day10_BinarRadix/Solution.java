package Challenge30DaysOfCode.Day10_BinarRadix;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        System.out.println(Integer.toBinaryString(n));
        Stack<Integer> number = new Stack();
        while (n > 0) {
            number.push(n % 2);
            n = n / 2;
        }
//        System.out.println(number.toString());
        int counter = 0;
        int max = 0;
        int index;
        while (!number.empty()) {
            index = number.pop();
            if (index == 1) {
                counter++;
                max = counter > max ? counter : max;
            } else {
                counter = 0;
            }

        }
        System.out.println(max);



    }
}
