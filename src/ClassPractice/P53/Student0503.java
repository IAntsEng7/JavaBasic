package ClassPractice.P53;

public class Student0503 {

  static int score = 80;

  public static void main(String[] args) {
    play(65);
    study(90);
    System.out.println("Student Score: " + score);
  }

  private static void play(int hours) {
    score -= hours;
  }

  private static void study(int hours) {
    score += hours;
  }
}
