package ClassPractice.P39;

public class TestBmi0503 {
  public static void main(String[] args) {
    double bmi = countBmi(1.68, 56.7);
    if (bmi < 18.5) {
      System.out.println("BMI值：" + bmi + "，過瘦");
    } else if (bmi >= 24) {
      System.out.println("BMI值：" + bmi + "，過胖");
    }else {
      System.out.println("BMI值：" + bmi + "，正常");
    }
  }

  private static double countBmi(double height, double weight) {
    return weight / Math.pow(height, 2);
  }
}
