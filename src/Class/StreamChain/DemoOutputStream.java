package Class.StreamChain;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class DemoOutputStream {
  public static void main(String[] args) {
    try{
      FileOutputStream fileOutputStream = new FileOutputStream("/Users/iantseng/Desktop/DemoOutputStream.txt");
      BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
      PrintStream printStream = new PrintStream(bufferedOutputStream);
      printStream.println("Hello World!! I put the words in this txt file.");

      printStream.close();
      bufferedOutputStream.close();
      fileOutputStream.close();
    }catch (Exception e){
      System.err.println(e);
    }
  }
}
