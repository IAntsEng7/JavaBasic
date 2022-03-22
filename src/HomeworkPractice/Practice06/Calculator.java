package HomeworkPractice.Practice06;

// 請設計三個類別：
// 1. Calculator.java，有個自訂方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。
// 2. CalException.java，產生自訂的CalException例外物件
// 3. CalTest.java，使用者可以輸入x與y的值,請加入例外處理機制,讓程式能解決以下狀況：
// -3a. x與y同時為0,(產生自訂的CalException例外物件)
// -3b. y為負值,而導致x的y次方結果不為整數
// -3c. x與y皆正確情況下,會顯示運算後結果

import java.util.InputMismatchException;

public class Calculator {
  int xyPower;

  public int powerXY(int x, int y) throws CalException, InputMismatchException {
    if (x == 0 && y == 0) {
      throw new CalException("X與Y不可同時為0");
    } else if (y < 0) {
      throw new CalException("次方Y不得為負值");
    } else {
      xyPower = (int) Math.pow(x, y);
    }
    return xyPower;
  }
}
