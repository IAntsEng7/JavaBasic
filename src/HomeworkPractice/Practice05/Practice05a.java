package HomeworkPractice.Practice05;

public class Practice05a {
  //	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能，
  //	請設計一個方法genAuthCode()，
  //	當呼叫此方法時會回傳一個8位數的驗證碼
  //	此驗證碼內容包含了英文大小寫與數字的亂數組合

  public static void main(String[] args) {
    Practice05a practice05a = new Practice05a();
    System.out.println(practice05a.genAuthCode());
  }

  // ASCII碼
  // 數字0-9 ASCII碼48-57
  // 字母A-Z ASCII碼65-90
  // 字母a-z ASCII碼97-122
  // 長度62:0-9 10個 + A-Z 26個 + a-z 26個

  public char[] genAuthCode() {
    char[] verifyCode = new char[8];
    int[] letters = new int[62];

    for (int i = 0; i < letters.length; i++) {
      if (i < 10) {
        letters[i] = 48 + i; // 0-9(索引值0-9)，ASCII碼數字0-9從48開始到57
      } else if (i >= 10 && i < 36) {
        letters[i] = 55 + i; // A-Z(索引值10-35)，ASCII碼,數字A-Z從65開始到90
      } else {
        letters[i] = 61 + i; // ASCII碼,數字a-z從97開始到122
      }
    }

    int random;
    for(int j = 0; j < verifyCode.length; j++){
      random = (int)(Math.random() * 61);
      verifyCode[j] = (char) letters[random];
    }
    return verifyCode;
  }
}
