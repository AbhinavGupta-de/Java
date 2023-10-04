package sorting;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKthMinimum {

 // Find the kth minimum element in an unsorted array of non-negative integers.
 public static int kthMinimum(int[] nums, int k) {

  // * One approach would be to sort the array and find the (k-1)th element.
  // * It would take O(nlogn) time.
  Arrays.sort(nums);
  return nums[k - 1];

 }

 // * Another approach would be to use a min heap.
 // * It would take O(n + klogn) time.
 public static int findKthMinimum(int[] arr, int k) {
  // Create a min heap
  PriorityQueue<Integer> minHeap = new PriorityQueue<>();

  // Build the min heap from the array
  for (int num : arr)
   minHeap.offer(num);

  // Extract k-1 elements (kth minimum will be the next extracted element)
  for (int i = 0; i < k - 1; i++)
   minHeap.poll();

  // The kth minimum element
  return minHeap.poll();
 }

 // * We can also use a max heap and keep the size of the heap to k.
 // * It would take O(n + klogk) time.
 public static int findKthMinimum2(int[] arr, int k) {
  // Create a max heap
  PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

  // Build the max heap from the array
  for (int num : arr) {
   maxHeap.offer(num);
   if (maxHeap.size() > k)
    maxHeap.poll();
  }

  // The kth minimum element
  return maxHeap.poll();
 }

 // * We can also use a quick select algorithm.
 // * It would take O(n) time.
 public static int findKthMinimum3(int[] arr, int k) {
  return quickSelect(arr, 0, arr.length - 1, k - 1);
 }

 private static int quickSelect(int[] arr, int low, int high, int k) {
  // * Partition the array
  int pivot = partition(arr, low, high);

  // * If pivot is same as k, we have found the kth minimum element
  if (pivot == k)
   return arr[pivot];

  // * If pivot is greater than k, we need to look in the left subarray
  if (pivot > k)
   return quickSelect(arr, low, pivot - 1, k);

  // * If pivot is less than k, we need to look in the right subarray
  return quickSelect(arr, pivot + 1, high, k);
 }

 private static int partition(int[] arr, int low, int high) {
  // * Pick the rightmost element as pivot
  int pivot = arr[high];

  // * Elements less than or equal to pivot are placed before the pivot
  // * Elements greater than pivot are placed after the pivot
  int i = low;
  for (int j = low; j < high; j++) {
   if (arr[j] <= pivot) {
    swap(arr, i, j);
    i++;
   }
  }

  // * Place the pivot element at its correct position
  swap(arr, i, high);

  // * Return the pivot index
  return i;
 }

 private static void swap(int[] arr, int i, int j) {
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
 }

 public static void main(String[] args) {

 }
}
