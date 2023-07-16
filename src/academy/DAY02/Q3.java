package academy.DAY02;

public class Q3 {
    public static void main(String[] args) {
        String id = "TEST1234";
        String ps = "991005";
        System.out.println("ID : " + id);
        System.out.println("PS : " + ps);

        int noodle = 5000*3;
        int rice = 6000*2;
        int discount = 3000;
        int total = noodle + rice;
        int result = total - discount;

        System.out.println("짜장면 : " + noodle);
        System.out.println("볶음밥 : " + rice);
        System.out.println("합계 : " + total);
        System.out.println("최종금액 : " + result);
    }
}
