package String.JavaStringCompare;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int k = in.nextInt();
        String[] substringS = new String[S.length() - k + 1];
        for (int i = 0; i < S.length() - k + 1; i++) {
            substringS[i] = S.substring(i, i + k);
        }
        System.out.println(Arrays.toString(substringS));
        String minSubstring = substringS[0];
        String maxSubstring = substringS[0];
        for (int i = 0; i < substringS.length; i++) {
            if (minSubstring.compareTo(substringS[i]) > 0) {
                minSubstring = substringS[i];
            }
            if (maxSubstring.compareTo(substringS[i]) < 0) {
                maxSubstring = substringS[i];
            }
        }
        System.out.println(minSubstring);
        System.out.println(maxSubstring);
    }
}
