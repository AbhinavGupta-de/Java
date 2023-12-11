package twoPointers;

public class PairSumTwo {
 public int pairSum(int[] A, int B) {
  long MOD = 1000000007;
  long count = 0L;

  int i = 0;
  int j = A.length - 1;

  while (i < j) {

   long sum = (long) A[i] + (long) A[j];
   if (sum == B) {

    if (A[i] == A[j]) {

     long len = j - i + 1;
     long add = (len * (len + 1)) / 2;
     count = (count + add) % MOD;
     break;
    }

    int left = 0;
    int right = 0;

    while (A[i] == A[i + left]) {
     left++;
    }

    while (A[j] == A[j - right]) {
     right++;
    }

    count = (count + (long) left * (long) right) % MOD;

    i += left;
    j -= right;

   }

   else if (sum < B) {
    i++;
   } else {
    j--;
   }
  }

  return (int) count;
 }

 public static void main(String[] args) {
  int[] nums = { 2, 3, 3, 5, 7, 7, 8, 9, 9, 10, 10 };
  int target = 11;

  System.out.println(new PairSumTwo().pairSum(nums, target));
 }
}
