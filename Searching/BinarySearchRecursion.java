package Searching;

public class BinarySearchRecursion {

 public int binarySearch(int[] arr, int start, int end, int target) {
  if (start > end) {
   return -1;
  }

  int mid = (start + end) / 2;

  if (arr[mid] == target) {
   return mid;
  } else if (arr[mid] > target) {
   return binarySearch(arr, start, mid - 1, target);
  } else {
   return binarySearch(arr, mid + 1, end, target);
  }

 }

 public int search(int[] arr, int target) {
  return binarySearch(arr, 0, arr.length - 1, target);
 }

 public static void main(String[] args) {
  int[] arr = { 1, 2, 3, 4, 5 };
  BinarySearchRecursion bsr = new BinarySearchRecursion();
  System.out.println(bsr.search(arr, 5));
 }

}
