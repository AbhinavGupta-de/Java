package Searching;

public class SmallestGoodBase {
 public String smallestGoodBase(String n) {

  long N = Long.valueOf(n);
  long start = 2;
  long end = (long) (Math.log(N) / Math.log(2)) + 1;
  long ans = N - 1;
  for (long d = end; d >= start; d--) {
   long m = findGoodBase(N, d);
   if (m != -1) {
    ans = m;
    break;
   }
  }
  return String.valueOf(ans);
 }

 public long findGoodBase(long N, long d) {
  long low = 2;
  long high = (long) Math.pow(N, (1.0 / (d - 1)));
  while (low <= high) {
   long base = low + (high - low) / 2;
   long value = expand(base, d);
   if (N == value)
    return base;
   else if (value < N)
    low = base + 1;
   else
    high = base - 1;
  }
  return -1L;
 }

 public long expand(long base, long d) {
  long power = base;
  long value = power;
  for (int i = 2; i < d; i++) {
   power *= base;
   value += power;
  }
  return value + 1;
 }

 public static void main(String[] args) {
  SmallestGoodBase s = new SmallestGoodBase();
  System.out.println(s.smallestGoodBase("727004545306745403"));
 }
}
