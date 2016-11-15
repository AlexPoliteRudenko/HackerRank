package WelcomeToJava.OutputFormating;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%2$-15s%1$03d%n", x, s1);
            //Complete this line
        }
//        System.out.printf("%3$4s %4$6s %2$2s %1$10s", "a", "b", "c", "d");
//        System.out.println();
        System.out.println("================================");

    }
}
