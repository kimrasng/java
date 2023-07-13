package self.ch2;

public class CharToCode {
    public static void main (String[] args) {
        char ch = 'A';  // char ch = '\u0041'; 로 봐꿔 써도 같다.
        int code = (int)ch; // ch에 저장된 값을 int 형으로 변환하여 저장한다.

        System.out.println(ch);
        System.out.println(code);
    }
}
//