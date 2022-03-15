package HomeworkPractice.Practice03;

import java.util.Arrays;
import java.util.Scanner;

public class Practice03a {
  // 請設計一隻程式，使用者輸入三個數字後，
  // 輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
  public static void main(String[] args) {
    System.out.println("請隨意輸入三個正整數：");
    Scanner sc = new Scanner(System.in);

    int[] triangle = new int[3]; // 取得三個正整數
    triangle[0] = sc.nextInt();
    triangle[1] = sc.nextInt();
    triangle[2] = sc.nextInt();

    Arrays.sort(triangle); // 排序
    System.out.println("輸入的三個正整數由小到大依序為：");
    for (int i = 0; i < triangle.length; i++) {
      System.out.print(triangle[i] + ", ");
    }

    // 將三個元素由小到大排序,避免因為輸入的順序導致直角三角形的判斷有問題
    int min = triangle[0];
    int mid = triangle[1];
    int max = triangle[2];
    System.out.println();

    if ((min + mid) > max && min > 0) {
      if (min == mid && mid == max) {
        System.out.println("輸入的三個正整數可構成一個正三角形"); // 正三角形：sc三個數字相等
      } else if (min == mid || mid == max || max == min) {
        System.out.println("輸入的三個正整數可構成一個等腰三角形"); // 等腰三角形：其中兩邊相等
      } else if (Math.pow(min, 2) + Math.pow(mid, 2) == Math.pow(max, 2)) {
        System.out.println("輸入的三個正整數可構成一個直角三角形"); // 直角三角形：min^2 + mid^2 == max^2
      } else {
        System.out.println("輸入的三個正整數可構成一個三角形"); // 其他三角形：非上述定義的三種三角形
      }
    } else {
      System.out.println("輸入的三個正整數無法構成一個三角形"); // 不是三角形：以上四種狀況都不成立
    }
  }
}
