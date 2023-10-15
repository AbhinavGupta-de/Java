package goodQuestions;

// import java.util.Arrays;

public class SpecialIndex {
  public int countSpecialIndex(int[] nums) {
    int n = nums.length;
    int[] evenSumCount = new int[n];
    int[] oddSumCount = new int[n];
    int count = 0;

    // if (n - 1 % 2 == 0) {
    // evenSumCount[0] = nums[n - 1];
    // // oddSumCount[0] = nums[n - 2];
    // } else {
    // // evenSumCount[0] = nums[n - 2];
    // oddSumCount[0] = nums[n - 1];
    // }

    // for (int i = 1; i < n; i++) {
    // if ((n - 1 - i) % 2 == 0) {
    // evenSumCount[i] = evenSumCount[i - 1] + nums[n - 1 - i];
    // oddSumCount[i] = oddSumCount[i - 1];
    // } else {
    // evenSumCount[i] = evenSumCount[i - 1];
    // oddSumCount[i] = oddSumCount[i - 1] + nums[n - 1 - i];
    // }
    // }

    // System.out.println(Arrays.toString(evenSumCount));
    // System.out.println(Arrays.toString(oddSumCount));

    // int count = 0;
    // for (int i = 0; i < n - 1; i++) {
    // int evenSums = (evenSumCount[0] - evenSumCount[i]) + oddSumCount[i];
    // int oddSums = (oddSumCount[0] - oddSumCount[i]) + evenSumCount[i];
    // if (evenSums == oddSums)
    // count++;
    // }

    // * finding the sum of numbers at even indices and odd indices
    evenSumCount[0] = nums[0];
    for (int i = 1; i < n; i++) {
      if (i % 2 == 0) {
        evenSumCount[i] = evenSumCount[i - 1] + nums[i];
        oddSumCount[i] = oddSumCount[i - 1];
      } else {
        oddSumCount[i] = oddSumCount[i - 1] + nums[i];
        evenSumCount[i] = evenSumCount[i - 1];
      }
    }

    // System.out.println(Arrays.toString(evenSumCount));
    // System.out.println(Arrays.toString(oddSumCount));

    // * Now, the main part checking if the sum of numbers at even indices and odd
    // * indices are equal
    for (int i = 1; i < n - 1; i++) {
      int evenSums = (evenSumCount[i - 1]) + oddSumCount[n - 1] - oddSumCount[i];
      int oddSums = (oddSumCount[i - 1]) + evenSumCount[n - 1] - evenSumCount[i];
      // System.out.println(evenSums + " " + oddSums);
      if (evenSums == oddSums)
        count++;
    }

    int[] prefixSum = new int[n];
    prefixSum[0] = nums[0];
    for (int i = 1; i < n; i++) {
      prefixSum[i] = prefixSum[i - 1] + nums[i];
    }
    // System.out.println((prefixSum[n - 1] / (n - 1)));
    if (prefixSum[n - 1] / (n - 1) == prefixSum[n - 2] / (n - 2))
      count += 2;

    return count;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    SpecialIndex si = new SpecialIndex();
    System.out.println(si.countSpecialIndex(nums));
  }
}
