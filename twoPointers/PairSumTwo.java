package twoPointers;

import java.util.HashMap;
import java.util.HashSet;

public class PairSumTwo {
 public int pairSum(int[] A, int B) {

  HashMap<Integer, Integer> map = new HashMap<>();

  for (int i = 0; i < A.length; i++) {
   if (map.containsKey(A[i])) {
    map.put(A[i], map.get(A[i]) + 1);
   } else {
    map.put(A[i], 1);
   }
  }

  int i = 0;
  int j = A.length - 1;

  int count = 0;

  // HashSet

  HashSet<Integer> set = new HashSet<>();

  for (int k = 0; k < A.length; k++) {
   if (set.contains(A[k])) {
    A[k] = 0;
   }
   set.add(A[k]);

  }

  while (i < j) {
   if (A[i] + A[j] == B) {

    if (A[i] == A[j]) {
     count += map.get(A[i]) * map.get(A[j]) / 2;
    } else {
     count += map.get(A[i]) + map.get(A[j]);
    }

    i++;
    j--;
   } else if (A[i] + A[j] < B) {
    i++;
   } else {
    j--;
   }
  }

  return count;

 }
}
