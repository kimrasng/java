package academy.DAY07;

class Variable6 {
    public static int cnt = 10;
    public void func() {
        System.out.println("cut : " + cnt);
    }
}
public class EX01_02 {
    public static void main(String[] args) {
        // var1 , var2, var3객체 생성 및 func()호출
        Variable6 var1 = new Variable6();
        var1.func();
        Variable6 var2 = new Variable6();
        var2.func();
        Variable6 var3 = new Variable6();
        var3.func();
        // 공통적인 cnt = 10 이라는 값을 한번만 저장한다.
    }
}
