package lambdaExpression;

@FunctionalInterface
interface Operations {
 int add(int i, int j);
}

public class LambdaReturn {
 public static void main(String[] args) {

  Operations obj1 = new Operations() {
   @Override
   public int add(int i, int j) {
    return i + j;
   }
  };

  System.out.println("The sum of 1 and 3 is: " + obj1.add(1, 3));

  Operations obj2 = (i, j) -> i + j;
  int result = obj2.add(32, 232);
  System.out.println(result);

 }
}
