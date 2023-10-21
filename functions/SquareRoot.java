package functions;

public class SquareRoot {
    public int squareRoot(int num) {
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                return i;
            }
        }
        return 0;
    }
}
