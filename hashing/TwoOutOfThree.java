package hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class TwoOutOfThree {

 public ArrayList<Integer> commonElements(ArrayList<Integer> A, ArrayList<Integer> B) {
  HashSet<Integer> first = new HashSet<>(A);
  HashSet<Integer> second = new HashSet<>(B);

  ArrayList<Integer> result = new ArrayList<>();

  for (Integer i : first) {
   if (second.contains(i)) {
    result.add(i);
   }
  }

  return result;
 }

 public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
  ArrayList<Integer> first = commonElements(A, B);
  ArrayList<Integer> second = commonElements(B, C);
  ArrayList<Integer> third = commonElements(A, C);

  HashSet<Integer> result = new HashSet<>();

  for (Integer i : first) {
   result.add(i);
  }

  for (Integer i : second) {
   result.add(i);
  }

  for (Integer i : third) {
   result.add(i);
  }

  ArrayList<Integer> finalResult = new ArrayList<>(result);
  Collections.sort(finalResult);
  return finalResult;
 }
}
