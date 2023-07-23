package academy.DAY06;

class Test1{
    public int test1() {
        return 10;
    }
    public int test2() {
        return 20;
    }
}
public class EX03 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.test1());
        System.out.println(t.test2());
        System.out.println(t.test1() + t.test2());

    }
}
