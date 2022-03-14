package ClassPractice.P44;

public class NineNineForWhile {
  public static void main(String[] args) {
    for (int i = 1; i <= 9; i++) {
      int j = 1;
      while (j <= 9) {
        System.out.print(i + "*" + j + " = " + i * j + "\t");
        j++;
      }
      System.out.println();
    }
  }
}
