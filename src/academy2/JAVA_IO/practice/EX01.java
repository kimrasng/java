package practice;

public class EX01 {
    public static void main(String[] args) {

        System.out.println("메인 메소드 입니다.");

        method1("Hello World");  // 메소드 호출

        int result = method2();

        System.out.println("method2가 돌려준 값 : " + result);


    }

    public static void method1(String str) {
        System.out.println("문자열 : " + str);
    }

    public static int method2() {
        System.out.println("method2 메소드 입니다.");
        return 100;
    }
}
