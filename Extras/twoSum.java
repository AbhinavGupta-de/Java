import java.util.ArrayList;
import java.util.Collections;

public class twoSum {

  public static void main(String[] args) {

  }

  public static int pairSumCount(ArrayList<Integer> arr, int sum) {
    Collections.sort(arr);
    int count = 0;
    for (int i = 0; 2 * i < arr.size(); i++) {
      if (Collections.binarySearch(arr, sum - arr.get(i)) >= 0) {
        if (arr.get(i) == sum - arr.get(i))
          count += Collections.frequency(arr, arr.get(i)) - 1;
        else
          count += Collections.frequency(arr, arr.get(i));
      }
    }
    return count;
  }

}
