package HomeworkPractice.Practice08;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections1 {
  public static void main(String[] args) {
    Collections1 collections1 = new Collections1();
    collections1.testCollection();
  }

  //		請建立一個Collection物件並將以下資料加入:
  //		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
  //		Object物件、“Snoopy”、BigInteger(“1000”)

  public void testCollection() {
    List list = new ArrayList();
    list.add(100);
    list.add(3.14);
    list.add(21l);
    list.add("100");
    list.add(5.1d);
    list.add("kitty");
    list.add(100);
    list.add(new Object());
    list.add("Snoopy");
    list.add(new BigInteger("1000"));

    // 印出這個物件裡的所有元素(使用Iterator, 傳統for迴圈與foreach)
    System.out.println("使用Iterator");
    Iterator objs = list.iterator();
    while (objs.hasNext()) {
      System.out.println(objs.next());
    }
    System.out.println("==============================");

    System.out.println("使用傳統for迴圈");
    for (int i = 0; i < list.size(); i++) {
      Object obj = list.get(i);
      System.out.println(obj);
    }
    System.out.println("==============================");

    System.out.println("使用foreach");
    for (Object obj : list) {
      System.out.println(obj);
    }
    System.out.println("==============================");

    //    移除不是java.lang.Number相關的物件
    for (int i = 0; i < list.size(); i++) {
      Object obj = list.get(i);

      if (!(obj instanceof Number)) {
        list.remove(i);
        i--;
      }
    }
    // 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
    System.out.println(list);
  }
}
