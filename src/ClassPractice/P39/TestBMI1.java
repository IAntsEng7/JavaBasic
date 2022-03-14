package ClassPractice.P39;

public class TestBMI1 {

  public static void main(String[] args) {
    double myHeight = 1.68;
    double myWeight = 24.6;
    double bmi = myWeight / Math.pow(myHeight, 2);

    if (bmi < 18.5) {
      System.out.println("BMI值：" + bmi + "，過瘦");
    } else if (bmi > 24) {
      System.out.println("BMI值：" + bmi + "，過胖");
    } else {
      System.out.println("BMI值：" + bmi + "，正常");
    }
  }
}
