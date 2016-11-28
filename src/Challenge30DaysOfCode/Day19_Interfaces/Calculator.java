package Challenge30DaysOfCode.Day19_Interfaces;

import java.util.ArrayList;

class Calculator implements AdvancedArithmetic{
    @Override
    public int divisorSum(int n) {
        int sum =0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        for (Integer listElement : list) {
            sum += listElement;
        }
        return sum;
    }
}
