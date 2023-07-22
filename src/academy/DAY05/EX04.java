package academy.DAY05;
import java.util.Scanner;
class SumClass {
    public void MethodTest_EX04(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        System.out.println("두 수의 합 : "+ sum);
    }
}
public class EX04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SumClass mt = new SumClass();
        int num1, num2;
        System.out.print("수 입력: ");
        num1 = input.nextInt();
        System.out.print("수 입력: ");
        num2 = input.nextInt();
        input.close();
        mt.MethodTest_EX04(num1, num2);
    }
}
