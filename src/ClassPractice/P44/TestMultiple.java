package ClassPractice.P44;

import java.util.Scanner;

public class TestMultiple {
  public static void main(String[] args) {
    System.out.println("請輸入正整數");
    Scanner sc1 = new Scanner(System.in);
    int num1 = sc1.nextInt();

    if (num1 % 1 != 0) {
      System.out.println("請重新輸入正整數");
      return;
    }

    System.out.println("想要測試 " + num1 + " 是否為哪個正整數的倍數？");
    Scanner sc2 = new Scanner(System.in);
    int num2 = sc2.nextInt();
    if (num2 % 1 != 0) {
      System.out.println("請重新輸入正整數");
      return;
    }

    if (num1 % num2 == 0) {
      System.out.println(num1 + " 是 " + num2 + " 的倍數");
    } else {
      System.out.println(num1 + " 非 " + num2 + " 的倍數");
    }
  }
}
