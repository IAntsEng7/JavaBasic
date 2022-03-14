package HomeworkPractice.Practice01;

public class Practice01 {
  public static void main(String[] args) {
    // 1. 請設計一隻Java程式,計算12,6這兩個數值的和與積
    int numA = 12;
    int numB = 6;
    System.out.println("12 + 6 的和為： " + (numA + numB));
    System.out.println("12 * 6 的積為： " + (numA * numB));
    System.out.println("=================================================");

    // 2. 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
    int egg = 200;
    System.out.println("200顆蛋共是" + (egg / 12) + "打" + (egg % 12) + "顆");
    System.out.println("=================================================");

    // 3. 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
    int fullSeconds = 256559;
    int second = fullSeconds % 60; // second
    int fullMinutes = 256559 / 60; // total minutes
    int minute = fullMinutes % 60; // minutes
    int fullHours = fullMinutes / 60; // total hours
    int hour = fullHours % 24;
    int day = fullHours / 24;
    System.out.println(day + "天" + hour + "小時" + minute + "分" + second + "秒");
    System.out.println("=================================================");

    // 4. 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
    final double pi = 3.1415;
    int radius = 5;
    System.out.println("圓面積為" + (pi * (Math.pow(radius, 2))));
    System.out.println("圓周長為" + (pi * (radius * 2)));
    System.out.println("=================================================");

    // 5. 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，
    //    請用程式計算10年後，本金加利息共有多少錢？
    //    本利和=本金×(1+年利率)^期間

    int money = 1500000;
    double rate = 0.02;
    double totalMoney = money * (Math.pow((1 + rate), 10));
    System.out.println("10年後本金加利息共有：" + (int) totalMoney + "元");
    System.out.println("=================================================");

    // 6. 請寫一隻程式，利用System.out.println()印出以下三個運算式結果並說明
    //    a. 5 + 5
    //    b. 5 + '5'
    //    c. 5 + "5"
    System.out.println("console:" + (5 + 5) + "，兩者皆為int，所以計算過程是兩整數相加");
    System.out.println(
        "console:"
            + (5 + '5')
            + "，前者為int而後者為char，而char轉為unicode內碼時可和整數或浮點數一起運算。"
            + "'5'的unicode代碼為35(十六進位)，print時Java會以十進位表示為53。"
            + "所以實際上的計算是5 + 53 = 58");
    System.out.println("console:" + (5 + "5") + "，前者為int而後者為String，55的第2個5實為String");
  }
}
