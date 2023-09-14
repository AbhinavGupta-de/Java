package goodQuestions;

public class LeaderElements {
 public static int numberLeaders(int[] n) {
  int max = n[0];
  int count = 1;
  for (int i = 1; i < n.length; i++) {
   if (n[i] > max) {
    max = n[i];
    count++;
   }
  }
  return count;
 }

 public static void main(String[] args) {
  int[] nums = { 3, 5, 1, 7, 9, 12, 45, 6, 21 };
  System.out.println(numberLeaders(nums));
 }
}
