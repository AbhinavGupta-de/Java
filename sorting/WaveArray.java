package sorting;

import java.util.Arrays;

// Given an array of integers, sort into a wave like array and retun it.
public class WaveArray {

 public static int[] sort(int[] arr) {
  Arrays.sort(arr);

  for (int i = 0; i < arr.length - 1; i += 2) {
   int temp = arr[i];
   arr[i] = arr[i + 1];
   arr[i + 1] = temp;
  }

  return arr;
 }
}
