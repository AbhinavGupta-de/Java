package Searching;

public class SmallestGoodBase {
 public String smallestGoodBase(String n) {
  // Brute Force
  // for (int i = 2; i < n - 1; i++) {
  // if (isGoodBase(i, n)) {
  // return i;
  // }
  // }

  // return n - 1;

  // Binary Search

  long num = Long.parseLong(String.valueOf(n));
  long ans = num - 1;
  for (int i = log(n); i >= 2; i--) {
   long low = 2;
   long high = num - 1;

   while (low <= high) {
    long mid = low + (high - low) / 2;
    long sum = 0;
    for (int j = 0; j < i; j++) {
     sum = sum * mid + 1;
    }
    if (sum == num) {
     ans = Math.min(ans, mid);
    }
    if (sum >= num) {
     high = mid - 1;
    } else {
     low = mid + 1;
    }
   }
  }
  return String.valueOf(ans);
 }

 private int log(String n) {
  return (int) (Math.log(Long.parseLong(n)) / Math.log(2));
 }

 // private boolean isGoodBase(int base, int n) {

 // // only 1s

 // while (n > 0) {
 // if (n % base != 1) {
 // return false;
 // }
 // n /= base;
 // }
 // return true;
 // }

 public static void main(String[] args) {
  SmallestGoodBase s = new SmallestGoodBase();
  System.out.println(s.smallestGoodBase("13"));
 }
}
