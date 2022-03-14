package HomeworkPractice.Practice02;

public class Practice02 {
  public static void main(String[] args) {
    // 1. 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
    int sum = 0;
    for (int i = 1; i <= 1000; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println("1～1000的偶數和為：" + sum);
    System.out.println("=================================================");

    // 2. 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
    int multipliedBy1 = 1;
    for (int i1 = 1; i1 <= 10; i1++) {
      multipliedBy1 *= i1;
    }
    System.out.println("用for迴圈計算1～10的連乘積為：" + multipliedBy1);
    System.out.println("=================================================");

    // 3. 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
    int multipliedBy2 = 1;
    int i2 = 1;
    while (i2 <= 10) {
      multipliedBy2 *= i2;
      i2++;
    }
    System.out.println("用while迴圈計算1～10的連乘積為：" + multipliedBy2);
    System.out.println("=================================================");

    // 4. 請設計一隻Java程式，輸出結果為以下： 1 4 9 16 25 36 49 64 81 100
    for (int i = 1; i <= 10; i++) {
      System.out.print((int) (Math.pow(i, 2)) + " ");
    }
    System.out.println();
    System.out.println("=================================================");

    // 5. 阿文很熱衷大樂透 (1 ～ 49)，但他有4的數字，不論是個位數或是十位數。
    //    請設計一隻程式，輸出結果為阿文可以不喜歡選擇的數字有哪些？總共有幾個？
    int count = 0;
    for (int i = 1; i <= 49; i++) {
      if ((i % 10 == 4) || (i >= 40)) {
        System.out.print(i + " ");
        count++;
      }
    }
    System.out.println();
    System.out.println("大樂透數字中有4的數字共有" + count + "個");
    System.out.println("=================================================");

    // 6. 請設計一隻Java程式，輸出結果為以下：
    //    1 2 3 4 5 6 7 8 9 10
    //    1 2 3 4 5 6 7 8 9
    //    1 2 3 4 5 6 7 8
    //    1 2 3 4 5 6 7
    //    1 2 3 4 5 6
    //    1 2 3 4 5
    //    1 2 3 4
    //    1 2 3
    //    1 2
    //    1
    for (int i = 10; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    System.out.println("=================================================");

    // 7. 請設計一隻Java程式，輸出結果為以下：
    //		A
    //		BB
    //		CCC
    //		DDDD
    //		EEEEE
    //		FFFFFF
    //    A = /'0041'/ = 65, F = /'0046'/ = 70
    for (int i3 = 1; i3 <= 6; i3++) {
      char word = (char) (64 + i3);
      int j = 1;
      while (j <= i3) {
        System.out.print(word);
        j++;
      }
      System.out.println();
    }
  }
}
