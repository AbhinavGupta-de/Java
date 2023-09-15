package goodQuestions;

public class ToggleBulbs {
 public static int countToggle(int[] A) {
  int count = 0;
  // * n^2 approach
  // for (int i = 0; i < A.length; i++){
  // if (A[i] == 0) {
  // count++;
  // for (int j = i; j < A.length; j++) {
  // if (A[j] == 0) {
  // A[j] = 1;
  // } else {
  // A[j] = 0;
  // }
  // }
  // }
  // }

  // * n approach
  int toggle = 0;
  for (int i = 0; i < A.length; i++) {
   if (A[i] == toggle) {
    count++;
    toggle = 1 - toggle;
   }
  }
  return count;
 }

 public static void main(String[] args) {
  int[] A = { 0, 1, 0, 1 };
  System.out.println(countToggle(A));
 }
}
