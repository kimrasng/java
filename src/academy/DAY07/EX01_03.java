package academy.DAY07;

class Variable7 {
    public static int cnt = 10;
    public static void func() {
        System.out.println("cut : " + cnt);
    }
}
public class EX01_03 {
    public static void main(String[] args) {
        // var1 , var2, var3객체 생성 및 func()호출
        Variable7.func();
    }
}
