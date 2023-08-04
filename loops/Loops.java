public class Loops {
    public static void main(String[] args) {
        int index = 0;
        while (index <= 100) {

            if (index == 40) {
                continue;
            }
            index += 5;
            System.out.println("Value of Index:" + index);
        }
    }
}