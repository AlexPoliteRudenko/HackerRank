package Challenge30DaysOfCode.Day17_MoreExceptions;

class Calculator {
    int power(int n, int p) {
        if (n < 0 || p < 0) {
            throw new ArithmeticException("n and p should be non-negative");
        }
        if (p == 0) {
            return 1;
        } else {
            return power(n, p - 1) * n;
        }
    }
}
