package academy.DAY06;
class Test {
    public void test1() {
        System.out.println(10);
    }
    public void test2() {
        System.out.println(20);
    }
}
public class EX02 {
    public static void main(String[] args) {
        Test t = new Test();
        t.test1();
        t.test2();
        // System.out.println(t.test1() + t.test2);
    }
}
