package HomeworkPractice.Practice04;

import java.util.Scanner;

public class Practice04e {
  //		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
  //		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
  //		(提示1:Scanner,陣列)
  //		(提示2:需將閏年條件加入)
  //		(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

  public static void main(String[] args) {
    Scanner scY = new Scanner(System.in);
    System.out.println("請輸入年(yyyy)：");
    int year = scY.nextInt();
    int month, day;
    int daySum = 0;

    if (year < 0) {
      System.out.println("請輸入正確年份");
    } else {
      System.out.println("請輸入月(mm)：");
      Scanner scM = new Scanner(System.in);
      month = scM.nextInt();

      if (month < 0 || month > 12) {
        System.out.println("請輸入正確月份");
      } else {
        System.out.println("請輸入日(dd)：");
        Scanner scD = new Scanner(System.in);
        day = scD.nextInt();

        if (day < 0 || (month == 2 && day > 29)) {
          System.out.println("請輸入正確日期");
        } else {
          int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 先將2月預設28日
          if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            monthDay[1] = 29; // 當閏年時將2月天數改成29日
          }

          for (int i = 0; i < month - 1; i++) {
            daySum += monthDay[i];
          }
          daySum += day;
        }
        System.out.println("輸入的日期為該年第：" + daySum + "天");
      }
    }
  }
}
