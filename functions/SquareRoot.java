package functions;

public class SquareRoot {
    public int squareRoot(int num) {
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                return i;
            } else
                return 0;
        }
        return 0;
    }
}
