package academy.DAY06;

import java.lang.reflect.Method;

class MethodLocalVariable {
    public void Method_Test_EX04_1() {
        int a = 10, b = 20;
        Method_Test_EX04_2(a, b);
        System.out.println("EX04_1 => a : " + a);
        System.out.println("EX04_1 => b : " + b);
    }
    public void Method_Test_EX04_2(int a, int b) {
        a += 100; b += 200;
        System.out.println("EX04_2 => a : " + a);
        System.out.println("EX04_2 => b : " + b);
    }
}
public class EX04 {
    public static void main(String[] args) {
        MethodLocalVariable localVal = new MethodLocalVariable();
        localVal.Method_Test_EX04_1();
    }
}
