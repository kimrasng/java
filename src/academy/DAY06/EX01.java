package academy.DAY06;
import java.util.Scanner;
class SumClassReturn {
    public int methodTest_EX01(int num1, int num2) {
        int sum = 0;
        sum = sum + 1;
        return sum; // 자료를 남기기 위해 사용
    }
}
public class EX01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // mtr 객체 생성1
        SumClassReturn mtr = new SumClassReturn();
            

        int num1, num2, sum;
        System.out.print("수입력 : ");
        num1 = input.nextInt();
        System.out.print("수입력 : ");
        num2 = input.nextInt();
        input.close();

        mtr.methodTest_EX01(num1, num2);
        sum = num1 + num2;
        System.out.println("두 수의 합 : " + sum);
    }
}
