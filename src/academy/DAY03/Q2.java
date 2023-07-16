package academy.DAY03;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        
        // 입력한 데이터가 3의 배수인 경우 출력하시오
        int data;

        System.out.print("수를 입력하시오: ");
        data = input.nextInt();

        if (data % 3 == 0)
            System.out.printf("3의 배수입니다.\n");
        else
            System.out.println("3의 배수가 아닙니다.");

        // 입력한 수의 절대값을 구하는 프로그램을 작성하시오.

        
        System.out.print("수를 입력하세요: ");
        data = input.nextInt();

        if (0 < data)
            System.out.println("절대값 : " + (data));
        else
            System.out.println("절대값 : \" + (-data)");


        // 두 수를 입력받아 큰 수를 출력하시오.

        int a, b;

        System.out.print("첫번쨰 숫를 입력하시오: ");
        a = input.nextInt();

        System.out.print("두번쨰 숫를 입력하시오: ");
        b = input.nextInt();

        if (a > b)
            System.out.printf("%d\n", a);
        else
            System.out.printf("%d\n", b);


        // 수를 입력받아 5의 배수이닞 판별 후 출력하시오

        System.out.print("수를 입력하세요: ");
        data = input.nextInt();

        if (data % 5 == 0)
            System.out.printf("%d는 5의 배수입니다.", data);
        else
            System.out.printf("%d는 5의 배수가 아닙니다.\n");

        // 수를 입력받아 3의 배수이며, 짝수인지 판별 후 출력하시오

        System.out.println("수를 입력하세요: ");
        data = input.nextInt();

        if (data % 3 == 0 && data % 2 == 0)
            System.out.printf("%d 는 3의 배수이며 짝수이다.\n", data);
        else
            System.out.printf("%d 는 조건을 만족하지 않습니다.", data);



        input.close();
    }
}
