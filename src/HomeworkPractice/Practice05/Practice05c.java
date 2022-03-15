package HomeworkPractice.Practice05;

public class Practice05c {
  //	請設計一個方法為randAvg(),
  //	從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

  public static void main(String[] args) {
    Practice05c practice05c = new Practice05c();
    practice05c.randAvg();
  }

  public void randAvg() {
    int index, random, avg, sum = 0;
    int[] randomArray = new int[10];
    System.out.println("10個亂數結果如下：");
    for (index = 0; index < randomArray.length; index++) {
      random = (int) (Math.random() * 101);
      randomArray[index] = random;
      System.out.print(random + " ");
      sum += random;
    }
    avg = sum / randomArray.length;
    System.out.println();
    System.out.println("10個取得的亂數平均值為："+avg);
  }
}
