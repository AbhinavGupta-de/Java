public class Solution {
  public int[] solve(int[] length, int[] breadth) {
    int n = breadth.length;

    int[] squares = new int[n];
    int[] ans = new int[n];

    for (int i = 0; i < n; i++) {
      Rectangle rectangle = new Rectangle(length[i], breadth[i]);
      if (rectangle.checkSquare())
        squares[i] = rectangle.area();

      int count = 0;
      for (int j = 0; j < i; j++) {
        if (squares[j] > rectangle.area())
          count++;
      }
      ans[i] = count;
    }

    // for (int j = 0; j < n; j++) {
    // System.out.print(squares[j] + " ");
    // }

    return ans;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] length = { 1, 2, 3, 4, 5 };
    int[] breadth = { 1, 2, 3, 4, 5 };
    int[] ans = solution.solve(length, breadth);
    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i] + " ");
    }
  }

}

class Rectangle {
  int l;
  int b;

  public Rectangle(int l, int b) {
    this.l = l;
    this.b = b;
  }

  public boolean checkSquare() {
    if (this.l == this.b) {
      return true;
    }
    return false;
  }

  public int area() {
    return this.l * this.b;
  }

  public boolean greaterArea(Rectangle K) {
    if (area() > K.area()) {
      return true;
    }

    return false;
  }
}
