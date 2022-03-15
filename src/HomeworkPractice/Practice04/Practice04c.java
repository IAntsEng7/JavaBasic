package HomeworkPractice.Practice04;

public class Practice04c {
  //		有個字串陣列如下 (八大行星):
  //		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
  //		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
  //		(提示:字元比對,String方法)
  public static void main(String[] args) {
    String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "neptune"};
    int count = 0;

    for (int i = 0; i < planet.length; i++) {
      // 先個別取出單字
      for (int character = 0; character < planet[i].length(); character++) {
        char letter = planet[i].charAt(character); // 再從單字裡透過索引值取得字元
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
          count++;
        }
      }
    }
    System.out.println("共有：" + count + "個母音");
  }
}
