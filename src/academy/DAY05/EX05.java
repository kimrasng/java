package academy.DAY05;

class MagicHat {
    public void MethodTest_EX05(int num){
        num = num + 1;
        System.out.println(num);
    }
}

public class EX05 {
    public static void main(String[] args) {
        MagicHat hat = new MagicHat();
        hat.MethodTest_EX05(1);
        hat.MethodTest_EX05(2);
        hat.MethodTest_EX05(3);
    }
}
