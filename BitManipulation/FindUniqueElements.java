package BitManipulation;

public class FindUniqueElements {
 // All the elements appear even number of times except two elements which appear
 // odd number of times.

 // Find the two elements which appear odd number of times.
 // XOR all the elements of the array. The result will be XOR of the two elements
 // which appear odd number of times.
 public static void findUniqueElements(int[] arr) {
  int xor = 0;
  for (int i = 0; i < arr.length; i++) {
   xor ^= arr[i];
  }
  int mask = xor & -xor;
  int x = 0;
  int y = 0;
  for (int i = 0; i < arr.length; i++) {
   if ((arr[i] & mask) == mask) {
    x ^= arr[i];
   } else {
    y ^= arr[i];
   }
  }
  System.out.println(x + " " + y);
 }

 public static void main(String[] args) {
  int[] arr = { 1, 2, 3, 2, 1, 4 };
  findUniqueElements(arr);
  int[] arr1 = { 1, 2, 3, 2, 1, 4, 4, 5 };
  findUniqueElements(arr1);
 }
}
