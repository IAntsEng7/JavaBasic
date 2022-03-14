package ClassPractice.P53;

public class Student {
  int score = 80;

  public void play(int hours) {
    score = score - hours;
    System.out.println("玩樂" + hours + "小時後分數為" + score);
  }

  public void study(int hours) {
    score = score + hours;
    System.out.println("學習" + hours + "小時後分數為" + score);
  }

  public static void main(String[] args) {
    Student studentA = new Student();
    studentA.play(12);
    studentA.study(5);
  }
}
