import java.util.ArrayList;
import java.util.HashSet;

public class HashSets {

 public static int solve(ArrayList<Integer> A) {
  // * We are going to find the smallest index of the number in the arraylist that
  // is not getting reaptead in the HashSet
  // HashSet<Integer> set = new HashSet<Integer>(A);

  // ArrayList<Integer> answers = new ArrayList<>();

  // set.forEach(n -> {

  // if (A.indexOf(n) != A.lastIndexOf(n))
  // answers.add(A.indexOf(n));
  // });
  // ;

  // Collections.sort(answers);
  // if (answers.size() > 0)
  // return A.get(answers.get(0));
  // else
  // return -1;

  // * Second Method which was wrong
  // HashSet<Integer> set = new HashSet<Integer>();

  // ArrayList<Integer> set2 = new ArrayList<Integer>();

  // for (int i = 0; i < A.size(); i++) {
  // if (set.contains(A.get(i))) {
  // set2.add(i);
  // } else {
  // set.add(A.get(i));
  // }
  // }

  // Collections.sort(set2);

  // if (set2.size() > 0) {
  // return A.get(set2.get(0));
  // }

  // return -1;

  // * Third Method
  // HashSet<Integer> set = new HashSet<Integer>();

  // ArrayList<Integer> set2 = new ArrayList<Integer>();

  // for (int i = 0; i < A.size(); i++) {
  // if (set.contains(A.get(i))) {
  // set2.add(i);
  // } else {
  // set.add(A.get(i));
  // }
  // }

  // int min = -1;

  // for(int i = 0; i < set2.size(); i++){

  // if(min > A.indexOf(set2.get(i))) {
  // min = A.indexOf(set2.get(i));
  // }
  // }
  // return min;
  // }

  // * Fourth Method

  HashSet<Integer> set = new HashSet<Integer>();

  int index = -1;
  for (int i = A.size() - 1; i >= 0; i--) {
   if (set.contains(A.get(i))) {
    index = i;
   } else {
    set.add(A.get(i));
   }
  }
  return index;
 }

 public static void main(String[] args) {
  ArrayList<Integer> A = new ArrayList<Integer>();
  A.add(1);
  A.add(1);
  A.add(2);
  A.add(3);
  System.out.println(solve(A));
 }

 public int solve2(int A, ArrayList<Integer> B) {

  HashSet<Integer> set = new HashSet<Integer>();

  for (int i = 0; i < B.size(); i++) {
   if (set.contains(A - B.get(i))) {
    return 1;
   } else {
    set.add(B.get(i));
   }
  }

  return 0;
 }
}
