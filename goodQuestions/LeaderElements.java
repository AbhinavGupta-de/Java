package goodQuestions;

import java.util.ArrayList;

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

 public ArrayList<Integer> leaderElements(ArrayList<Integer> A) {
  ArrayList<Integer> leaders = new ArrayList<Integer>();
  int max = A.get(A.size() - 1);
  leaders.add(max);
  for (int i = A.size() - 1; i >= 0; i--) {
   if (A.get(i) > max) {
    max = A.get(i);
    leaders.add(max);
   }
  }
  return leaders;
 }

 public static void main(String[] args) {
  int[] nums = { 3, 5, 1, 7, 9, 12, 45, 6, 21 };
  System.out.println(numberLeaders(nums));
 }
}
