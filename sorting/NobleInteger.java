package sorting;

import java.util.Arrays;

public class NobleInteger {

 public static int nobleInteger(int[] arr) {
  Arrays.sort(arr);
  int size = arr.length;
  for (int i = 0; i < size; i++) {
   while (i + 1 < size && arr[i] == arr[i + 1])
    i++;
   if (arr[i] == size - 1 - i)
    return 1;
  }
  return -1;
 }

 // public static int nobleInteger(int[] arr) {
 // Arrays.sort(arr);
 // int count = 0;
 // for (int i = 0; i < arr.length; i++) {
 // if (arr[i] == i) {
 // count++;
 // }
 // }

 // return count;
 // }

 public static void main(String[] args) {
  int[] arr = { -1, -5, 3, 5, -10, 4 };
  System.out.println(nobleInteger(arr));
 }

}
