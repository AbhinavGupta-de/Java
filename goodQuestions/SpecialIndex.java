package goodQuestions;

public class SpecialIndex {
 public int countSpecialIndex(int[] nums) {
  int n = nums.length;
  int[] evenSumCount = new int[n];
  int[] oddSumCount = new int[n];

  if (n - 1 % 2 == 0) {
   evenSumCount[0] = nums[n - 1];
   oddSumCount[0] = nums[n - 2];
  } else {
   evenSumCount[0] = nums[n - 2];
   oddSumCount[0] = nums[n - 1];
  }

  for (int i = 1; i < n; i++) {
   if (n - 1 - i % 2 == 0) {
    evenSumCount[i] = evenSumCount[i - 1] + nums[n - 1 - i];
    oddSumCount[i] = oddSumCount[i - 1];
   } else {
    evenSumCount[i] = evenSumCount[i - 1];
    oddSumCount[i] = oddSumCount[i - 1] + nums[n - 1 - i];
   }
  }

  int count = 0;
  for (int i = 0; i < n - 1; i++) {
   int evenSums = (evenSumCount[0] - evenSumCount[i]) + oddSumCount[i] - oddSumCount[0];
   int oddSums = (oddSumCount[0] - oddSumCount[i]) + evenSumCount[i] - evenSumCount[0];
   if (evenSums == oddSums)
    count++;
  }

  return count;
 }
}
