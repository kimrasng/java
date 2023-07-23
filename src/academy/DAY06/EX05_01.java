package academy.DAY06;
class AccessModifier1 {
    public String Method_Test_EX05(int x, int y) {
        // 두 수 비교 하여 결과 값 리턴
        if (x>y) {
            return x + "이" + y + "보다 크다.";
        }else if(y>x) {
            return y + "이" + x + "보다 크다.";
        }else {
            return x + "와" + y + "은같다.";
        }
    }
}
public class EX05_01 {
    public static void main(String[] args) {
        // 객체 생성하여 메소드 호출 후 결과 출력 해보기
        AccessModifier1 bigTest = new AccessModifier1();
        String str = bigTest.Method_Test_EX05(100, 200);
        System.out.println("결과 : " + str);
    }
}
