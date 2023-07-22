package academy.DAY05;

class 인사2 {
    public void MethodTest(String name) {
        System.out.println(name + "님 안녕하세요");
        System.out.println(name + "님 반갑습니다");
        System.out.println(name + "또 만나요");
    }
}
public class EX06 {
    public static void main(String[] args) {
        인사2 hi2 = new 인사2();
        hi2.MethodTest("펭수");
        hi2.MethodTest("범이");
        hi2.MethodTest("뚝딱이");
    }
}
