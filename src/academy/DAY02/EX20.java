package academy.DAY02;

public class EX20 {
    public static void main(String[] args) {
        // 대입 & 복합 대입연산자
        int data1, data2;
        data1 = data2 = 5;
        System.out.println("data1 + 1 = " + (data1 += 1));
        System.out.println("data1 - 1 = " + (data1 -= 1));
        System.out.println("data1 * 1 = " + (data1 *= 1));
        System.out.println("data1 / 1 = " + (data1 /= 1));
        System.out.println("data1 % 1 = " + (data1 %= 1));
    }
}
