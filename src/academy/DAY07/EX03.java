package academy.DAY07;

class Final_03 {
    public static final String KOREA = "대한민국";
    public static final String PI = "3.14";
}

class User1 {
    public void func() {
        System.out.println("KOREA : " + Final_03.KOREA);
        System.out.println("PI : " + Final_03.PI);
    }
}

class User2 {
    public void func() {
        System.out.println("KOREA : " + Final_03.KOREA);
        System.out.println("PI : " + Final_03.PI);
    }
}

public class EX03 {
    public static void main(String[] args) {
        User1 u1 = new User1();
        User2 u2 = new User2();
        u1.func();
        u2.func();
    }
}
