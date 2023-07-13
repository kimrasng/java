package DAY02;

public class EX24 {
    public static void main(String[] args) {
        // 조건연산자
        int data = 8;
        String s = (data % 2 == 0) ? "짝수" : "홀수";
        System.out.println(data + "=" + s);
        data = 9;
        s = (data % 2 == 0) ? "짝수" : "홀수";
        System.out.println(data + "=" + s);
    }
}
