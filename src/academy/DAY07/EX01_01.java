package academy.DAY07;

class Variable5 {
    public int cnt = 10;
    public void func() {
        System.out.println("cut : " + cnt);
    }
}
public class EX01_01 {
    public static void main(String[] args) {
        // var1 , var2, var3객체 생성 및 func()호출
        Variable5 var1 = new Variable5();
        var1.func();
        Variable5 var2 = new Variable5();
        var2.func();
        Variable5 var3 = new Variable5();
        var3.func();
        // 메모리를 낭비하기에 비효율 적임
    }
}
