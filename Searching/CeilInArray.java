package Searching;

public class CeilInArray {

 public int solve(int A, int[] B, int C) {

  int start = 0;
  int end = A - 1;

  int ans = -1;

  while (start <= end) {
   int mid = start + (end - start) / 2;

   if (B[mid] == C)
    return B[mid];

   if (B[mid] > C) {
    ans = B[mid];
    end = mid - 1;
   } else {
    start = mid + 1;
   }
  }

  if (ans == -1)
   return ans;

  return B[ans];

 }

}
