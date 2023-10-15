package goodQuestions;

import java.util.*;

public class Anagram {
 // * Given an array A of N strings, return all groups of strings that are
 // anagrams.

 // Represent a group by a list of integers representing the index(1-based) in
 // the original list. Look at the sample case for clarification.

 // NOTE: Anagram is a word, phrase, or name formed by rearranging the letters,
 // such as 'spar', formed from 'rasp'.
 public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {

  ArrayList<ArrayList<Integer>> result = new ArrayList<>();
  HashMap<String, ArrayList<Integer>> map = new HashMap<>();

  for (int i = 0; i < A.size(); i++) {

   char[] arr = A.get(i).toCharArray();
   Arrays.sort(arr);

   String sorted = new String(arr);

   if (!map.containsKey(sorted)) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(i + 1);
    map.put(sorted, list);
   } else {
    map.get(sorted).add(i + 1);
   }

  }

  for (String key : map.keySet()) {
   result.add(map.get(key));
  }

  return result;
 }

}
