package Searching;

public class NthMagicalNumber {
 public int nthMagicalNum(int n, int a, int b) {
  int MOD = 1000000007;
  int min = Math.min(a, b);
  long start = min;
  long end = (long) min * n;

  while (start < end) {
   long mid = start + (end - start) / 2;

   if (count(mid, a, b) < n)
    start = mid + 1;
   else
    end = mid;
  }

  return (int) (start % MOD);
 }

 private long count(long num, int a, int b) {
  long countA = num / a;
  long countB = num / b;
  long countLCM = num / lcm(a, b);
  return countA + countB - countLCM;
 }

 private long lcm(int a, int b) {
  return a / gcd(a, b) * b;
 }

 private long gcd(int a, int b) {
  if (b == 0)
   return a;

  return gcd(b, a % b);
 }

 public static void main(String[] args) {
  NthMagicalNumber obj = new NthMagicalNumber();
  System.out.println(obj.nthMagicalNum(807414236, 3788, 38141));
 }
}
