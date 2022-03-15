package HomeworkPractice.Practice03;

import java.util.Scanner;

public class Practice03b2 {
  // 請設計一隻程式，會亂數產生一個產生0~100亂數的數字，
  // 然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息
  // (提示：Scanner，亂數方法，無窮迴圈)
  // (進階功能:每次猜就會提示你是大於還是小於正確答案)

  public static void main(String[] args) {
    int number = (int) (Math.random() * 101);

    System.out.println("請輸入0~100的整數");
    Scanner sc = new Scanner(System.in);

    while (true) {
      int guessNum = sc.nextInt();
      if (guessNum > number) {
        System.out.println("比" + guessNum + "小");
      } else if (guessNum < number) {
        System.out.println("比" + guessNum + "大");
      } else {
        System.out.println("正確答案");
        break;
      }
    }
  }
}
