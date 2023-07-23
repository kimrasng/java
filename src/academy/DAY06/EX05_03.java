package academy.DAY06;

import java.lang.invoke.MethodHandle;

class AccessModifier3 {
    private String Method_Test_EX05(int x, int y) {
        // 두 수 비교 하여 결과 값 리턴
        if (x>y) {
            return x + "이" + y + "보다 크다.";
        }else if(y>x) {
            return y + "이" + x + "보다 크다.";
        }else {
            return x + "와" + y + "은같다.";
        }
    }
    public  String subMethod_Test_EX05(int x, int y) {
        String str = Method_Test_EX05(x, y);
        return str;
    }
}
public class EX05_03 {
    public static void main(String[] args) {
        AccessModifier3 bigTest = new AccessModifier3();
        String str = bigTest.subMethod_Test_EX05(100, 200);
        System.out.println("결과 : " + str);
    }
}
