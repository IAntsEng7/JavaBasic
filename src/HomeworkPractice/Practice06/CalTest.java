package HomeworkPractice.Practice06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    while (true) {
      try {
        System.out.println("請輸入整數X");
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        System.out.println("請輸入要查詢的是X的幾次方");
        Scanner sc2 = new Scanner(System.in);
        int y = sc2.nextInt();
        System.out.println(calculator.powerXY(x, y));
        break;
      } catch (CalException ce) {
        System.out.println(ce.getMessage());
      } catch (InputMismatchException ime) {
        System.out.println("輸入資料格式不符");
      }
    }
  }
}
