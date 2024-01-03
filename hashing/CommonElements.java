
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.
 * Also, Each element in the result should appear as many times as it appears in both arrays.
 * The result can be in any order.
 */
public class CommonElements {
 public ArrayList<Integer> commonElements(ArrayList<Integer> A, ArrayList<Integer> B) {
  ArrayList<Integer> result = new ArrayList<>();

  HashMap<Integer, Integer> mapA = new HashMap<>();
  HashMap<Integer, Integer> mapB = new HashMap<>();

  // * We are going to store the frequency in a HashMap, then just iterate over
  // * the other array and check if the element is in the HashMap
  for (int i = 0; i < A.size(); i++) {
   if (!mapA.containsKey(A.get(i))) {
    mapA.put(A.get(i), 1);
   } else {
    mapA.put(A.get(i), mapA.get(A.get(i)) + 1);
   }
  }

  for (int i = 0; i < B.size(); i++) {
   if (!mapB.containsKey(B.get(i))) {
    mapB.put(B.get(i), 1);
   } else {
    mapB.put(B.get(i), mapB.get(B.get(i)) + 1);
   }
  }

  for (int i = 0; i < A.size(); i++) {
   if (mapB.containsKey(A.get(i))) {
    int min = Math.min(mapA.get(A.get(i)), mapB.get(A.get(i)));
    for (int j = 0; j < min; j++) {
     result.add(A.get(i));
    }
    mapA.remove(A.get(i));
    mapB.remove(A.get(i));
   }
  }

  return result;
 }
}
