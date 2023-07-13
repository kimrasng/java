package self.ch2;

public class CodeTochar {
    public static void main (String[] args) {
        int code = 65;  // 또는 int code = 0x0041;
        char ch = (char)code;
        
        System.out.println(code);
        System.out.println(ch);
    }
}
