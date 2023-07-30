package academy.DAY08;

import java.util.Scanner;

public class EX14_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        System.out.println("정수 입력 : ");
        int num1 = input.nextInt();
        System.out.println("정수 입력 : ");
        int num2 = input.nextInt();
        int result = num1 / num2;
        System.out.println("나눗셈 결과 : " + result);

        System.out.println("인덱스 범위 입력 : ");
        int su = input.nextInt();
        for (int i=0; i<su; i++)
            System.out.println(arr[i]);
        input.close();
    }
}
