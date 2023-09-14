package HashSets_And_HasMaps;

import java.util.ArrayList;

/*  
* Shaggy has an array A consisting of N elements. 
* We call a pair of distinct indices in that array a special if elements at those indices in the array are equal.
* Shaggy wants you to find a special pair such that the distance between that pair is minimum. 
* Distance between two indices is defined as |i-j|. If there is no special pair in the array, then return -1. 
*/

public class SameElementMinDistance {
 public int minDistance(ArrayList<Integer> A) {
  int minDistance = Integer.MAX_VALUE;
  for (int i = 0; i < A.size(); i++) {
   for (int j = i + 1; j < A.size(); j++) {
    if (A.get(i) == A.get(j)) {
     minDistance = Math.min(minDistance, j - i);
    }
   }
  }
  if (minDistance == Integer.MAX_VALUE) {
   return -1;
  }
  return minDistance;
 }
}
