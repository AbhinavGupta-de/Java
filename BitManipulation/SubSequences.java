package BitManipulation;

import java.util.*;

/**
 * SubSequences
 */
public class SubSequences {

 public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
  ArrayList<ArrayList<Integer>> result = new ArrayList<>();

  int iterator = (int) Math.pow(2, A.size());

  for (int i = 0; i < iterator; i++) {
   result.add(getElements(A, i));
  }

  // System.out.println(result);

  Collections.sort(result, (a, b) -> {
   int min = Math.min(a.size(), b.size());
   // System.out.println("Comparing " + a + " and " + b + ": " + min);
   for (int i = 0; i < min; i++) {
    // System.out.println("Comparing " + a.get(i) + " and " + b.get(i) + ": " +
    // a.get(i) + " > " + b.get(i));
    if (a.get(i) < b.get(i)) {
     // System.out.println("Comparing " + a.get(i) + " and " + b.get(i) + ": " +
     // a.get(i) + " > " + b.get(i));
     return -1;
    } else if (a.get(i) > b.get(i)) {
     return 1;
    }
   }

   if (a.size() > b.size()) {
    // System.out.println("Comparing sizes: " + a.size() + " > " + b.size());
    return 1;
   }

   return 0;
  });

  return result;
 }

 public ArrayList<Integer> getElements(ArrayList<Integer> nums, int num) {

  ArrayList<Integer> result = new ArrayList<>();
  int n = nums.size();

  while (num > 0) {
   if ((num & 1) == 1) {
    result.add(nums.get(n - 1));
   }
   num = num >> 1;
   n--;
  }

  Collections.sort(result);

  return result;
 }

 public static void main(String[] args) {
  ArrayList<Integer> A = new ArrayList<>();
  // [9,-20,-11,-8,-4,2,-12,14,1,-18]
  A.add(9);
  A.add(-20);
  A.add(-11);
  ArrayList<ArrayList<Integer>> result = new SubSequences().subsets(A);
  System.out.println(result);
 }

}