public class Factors {
 public static void main(String[] args) {
  Fraction factors = new Fraction(2, 6);
  Fraction a = new Fraction(2, 3);

  Fraction addAns = factors.add(a);
  System.out.println(addAns.numerator + "/" + addAns.denominator);

  // Fraction subAns = factors.subtract(a);
  // System.out.println(subAns.numerator + "/" + subAns.denominator);

  // Fraction multAns = factors.multiply(a);
  // System.out.println(multAns.numerator + "/" + multAns.denominator);
 }
}

class Fraction {
 int numerator, denominator;

 // Define constructor here

 Fraction coPrimes(Fraction a) {
  int n = a.numerator;
  int d = a.denominator;

  int temp = n;
  if (n < 0)
   n = -n;

  int min = n;
  if (min > d)
   min = d;

  Fraction ans = new Fraction();

  for (int i = 2; i <= min; i++) {
   if (n % i == 0 && d % i == 0) {
    System.out.println(i);
    n = n / i;
    d = d / i;
   }
  }

  ans.numerator = n;
  ans.denominator = d;

  if (temp < 0)
   ans.numerator = -ans.numerator;
  return ans;
 }

 Fraction add(Fraction a) {
  int n1 = a.denominator * numerator;
  int n2 = denominator * a.numerator;
  int n = n1 + n2;
  int d = denominator * a.denominator;
  Fraction addAns = new Fraction(n, d);
  Fraction temp = coPrimes(addAns);
  temp = coPrimes(temp);
  return coPrimes(temp);
 }

 Fraction subtract(Fraction a) {
  int n1 = a.denominator * numerator;
  int n2 = denominator * a.numerator;
  int n = n1 - n2;
  int d = denominator * a.denominator;
  Fraction subAns = new Fraction(n, d);
  Fraction temp = coPrimes(subAns);
  temp = coPrimes(temp);
  return coPrimes(temp);
 }

 Fraction multiply(Fraction a) {
  int n = numerator * a.numerator;
  int d = denominator * a.denominator;
  Fraction multAns = new Fraction(n, d);
  Fraction temp = coPrimes(multAns);
  temp = coPrimes(temp);
  return coPrimes(temp);
 }

 public Fraction(int n, int d) {
  this.numerator = n;
  this.denominator = d;
 }

 public Fraction() {

 }
}