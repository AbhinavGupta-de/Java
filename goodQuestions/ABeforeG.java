package goodQuestions;

// * Number of a before g in string
public class ABeforeG {

 public static int countA(String s) {
  int totalCount = 0;
  int count = 0;
  for (int i = 0; i < s.length(); i++) {
   if (s.charAt(i) == 'a') {
    count++;
   }
   if (s.charAt(i) == 'g') {
    totalCount += count;
    count = 0;
   }
  }
  return totalCount;
 }

 public static void main(String[] args) {
  String s = "abgabaag";
  System.out.println(countA(s));
 }
}
