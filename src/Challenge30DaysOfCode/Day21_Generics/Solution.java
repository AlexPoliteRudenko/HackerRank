package Challenge30DaysOfCode.Day21_Generics;

public class Solution {
    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        printArray( intArray  );
        printArray( stringArray );

        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }

    private static <E> void printArray(E[] e) {
        for(E element: e){
            System.out.println(element);
        }
    }
}
