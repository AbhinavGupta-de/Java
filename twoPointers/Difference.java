package twoPointers;

/**
 * Difference
 */
public class Difference {

  public boolean diffExist(int[] A, int B) {

    int i = 0;
    int j = 1;

    while (i < A.length && j < A.length) {
      if (i != j && A[j] - A[i] == B)
        return true;
      else if (A[j] - A[i] < B)
        j++;
      else
        i++;
    }

    return false;
  }

}