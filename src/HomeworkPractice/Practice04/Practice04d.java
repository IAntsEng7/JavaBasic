package HomeworkPractice.Practice04;

import java.util.Scanner;

public class Practice04d {
  //		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,
  //		其員工編號與身上現金列表如下:
  //    員編    25   32   8   19   27
  //    金額  2500  800 500 1000 1200
  //		請設計一個程式，可讓阿文輸入欲借金額後顯示哪些員工編號的同事有錢可借他;
  //		並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」

  public static void main(String[] args) {
    System.out.println("請輸入欲借金額：");
    Scanner keyIn = new Scanner(System.in);
    int money = keyIn.nextInt();

    int[][] borrow = {{25, 32, 8, 19, 27}, {2500, 800, 500, 1000, 1200}};
    int[] borrowList = new int[5];
    int count = 0;

    System.out.println("有錢可借的員工編號：");

    for (int i = 0; i < borrow.length; i++) {
      for (int j = 0; j < borrow[i].length; j++) {
        if (money <= borrow[i][j]) {
          borrowList[i] = borrow[0][j];
          System.out.print(borrowList[i] + "\t");
          count++;
        }
      }
    }
    System.out.println("，共" + count + "人!");
  }
}
