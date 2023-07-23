package academy.DAY06;

import java.util.Scanner;

class Absolute{
    public int absoluteCheck(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
    public void outPut(int num, int result) {
        System.out.println("입력값 : " + num);
        System.out.println("출력값 : " + result);
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Absolute absolute = new Absolute();
        System.out.print("수입력 : ");
        int num = input.nextInt();
        input.close();
        int result = absolute.absoluteCheck(num);
        absolute.outPut(num, result);
    }

}
