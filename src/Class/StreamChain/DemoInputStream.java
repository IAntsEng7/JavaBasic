package Class.StreamChain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoInputStream {
  public static void main(String[] args) throws IOException {
    File file = new File("/Users/iantseng/Desktop/DemoInputStream.txt");
    FileReader fileReader = new FileReader(file);
    int charCount = 0;
    int print;
    while ((print = fileReader.read()) != -1) {
//      System.out.print((char) print); // 印出DemoInputStream.txt的內容
      charCount++;
    }
    fileReader.close();

    // 暫時不清楚為什麼兩個FileReader一起跑的時候，上面的列印會被截斷...

    FileReader fileReader2 = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader2);
    int lineCount = 0;
    while (bufferedReader.readLine() != null) {
      lineCount++;
    }
    bufferedReader.close();
    fileReader2.close();

    long size = file.length();

    System.out.print("Sample.txt檔案");
    System.out.print("共有 " + size + "個位元組，");
    System.out.print(charCount + "個字元，");
    System.out.print(lineCount + "列資料");
  }
}
