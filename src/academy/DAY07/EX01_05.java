package academy.DAY07;

class Variable9 {
    public static void fuc() {
        System.out.println("Func Method");
//        fuc2();
    }

    public void func2() {
        System.out.println("Func Method2");
    }
}
public class EX01_05 {
    public static void main(String[] args) {
        Variable9.fuc();
        // Static Method에서 Instance Method를 호출 할 경우 Error가 발생한다.
    }
}
