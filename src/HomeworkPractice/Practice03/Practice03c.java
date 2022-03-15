package HomeworkPractice.Practice03;

import java.util.Scanner;

public class Practice03c {
  //	阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，
  //	但這次他想要依心情決定討厭哪個數字。
  //	請設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，
  //	畫面會顯示他可以選擇的號碼與總數。
  //	(提示：Scanner)

  public static void main(String[] args) {
    System.out.println("請輸入不想要的數字，範圍是0~9的整數");
    Scanner sc = new Scanner(System.in);
    int unlikeNum = sc.nextInt();

    if (unlikeNum < 0 || unlikeNum > 9) {
      System.out.println("請輸入0~9的整數");
    }

    System.out.println("可選擇的數字有：");

    int numbers[] = new int[49]; // 建立陣列可存放稍後取得的可選擇數字
    int count = 0;
    int chooseNum;
    for (chooseNum = 1; chooseNum <= 49; chooseNum++) {
      if (chooseNum % 10 == unlikeNum || chooseNum / 10 == unlikeNum) {
        continue;
      }
      System.out.print(chooseNum + "\t");
      numbers[count] = chooseNum; // 將可選擇的數字放進先前建立的陣列中，索引值從count = 0開始
      count++;
    }
    System.out.println();
    System.out.println("可選的數字有" + count + "個");
  }
}
