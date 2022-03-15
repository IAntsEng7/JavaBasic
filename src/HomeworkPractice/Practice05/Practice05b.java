package HomeworkPractice.Practice05;

import java.util.Scanner;

public class Practice05b {
  //	請設計一個方法為starSquare(int width, int height),
  //	當使用者鍵盤輸入寬與高時,即會印出對應的*長方形

  public static void main(String[] args) {
    System.out.println("請輸入寬：(正整數)");
    Scanner sc1 = new Scanner(System.in);
    int width = sc1.nextInt();
    System.out.println("請輸入高：(正整數)");
    Scanner sc2 = new Scanner(System.in);
    int height = sc2.nextInt();
    Practice05b practice05b = new Practice05b();

    if (width <= 0 || height <= 0) {
      System.out.println("請輸入大於0的整數");
    } else {
      practice05b.starSquare(width, height);
    }
  }

  public void starSquare(int width, int height) {
    for (int i = 1; i <= height; i++) {
      for (int j = 1; j <= width; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
