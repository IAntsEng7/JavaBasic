package HomeworkPractice.Practice03;

import java.util.Scanner;

public class Practice03b1 {
  // 請設計一隻程式，會亂數產生一個0～9的數字，
  // 然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息
  // (提示：Scanner，亂數方法，無窮迴圈)

  public static void main(String[] args) {
    System.out.println("猜數字，請輸入0~9任意一個數");

    int number = (int) (Math.random() * 10);

    Scanner sc = new Scanner(System.in);
    int guess = sc.nextInt();

    if (guess != number) {
      System.out.println("你猜錯了，正確答案是：" + number);
    } else {
      System.out.println("你猜對了，正確答案：" + guess);
    }
  }
}
