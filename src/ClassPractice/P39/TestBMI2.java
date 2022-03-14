package ClassPractice.P39;

import java.math.BigDecimal;
import java.util.Scanner;

public class TestBMI2 {
  public static void main(String[] args) {
    System.out.println("請輸入身高(0~3m)後按enter");
    Scanner sc1 = new Scanner(System.in);
    double height = sc1.nextDouble();
    if (height <= 0 || height > 3) {
      System.out.println("請輸入正數數值");
      return;
    }

    System.out.println("請輸入體重(kg)後按enter");
    Scanner sc2 = new Scanner(System.in);
    double weight = sc2.nextDouble();
    if (weight <= 0) {
      System.out.println("請輸入正數數值");
      return;
    }

    double count = weight / (Math.pow(height, 2));
    BigDecimal b = new BigDecimal(count);
    double countBMI = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();

    if (countBMI <= 18.5) {
      System.out.println("BMI值：" + countBMI + "，BMI值過瘦");
    } else if (countBMI >= 24) {
      System.out.println("BMI值：" + countBMI + "，BMI值過胖");
    } else {
      System.out.println("BMI值：" + countBMI + "，BMI值正常");
    }
  }
}
