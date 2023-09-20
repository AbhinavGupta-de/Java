package goodQuestions;

/**
 * EquilibriumElement
 */
public class EquilibriumElement {

 public static void main(String[] args) {
  int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
  System.out.println(equilibrium(arr));
 }

 public static int equilibrium(int[] arr) {
  int sum = 0;
  int leftSum = 0;
  for (int i = 0; i < arr.length; i++) {
   sum += arr[i];
  }
  for (int i = 0; i < arr.length; i++) {
   sum -= arr[i];
   if (leftSum == sum) {
    return i;
   }
   leftSum += arr[i];
  }
  return -1;
 }
}