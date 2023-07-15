package DAY03;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int day;

        System.out.println("날짜를 입력하시오: ");
        day = input.nextInt();

        if (day % 7 == 1)
            System.out.printf("%d 일은 월요일 입니다.\n", day);
        if (day % 7 == 2)
            System.out.printf("%d 일은 화요일 입니다.\n", day);
        if (day % 7 == 3)
            System.out.printf("%d 일은 수요일 입니다.\n", day);
        if (day % 7 == 4)
            System.out.printf("%d 일은 목요일 입니다.\n", day);
        if (day % 7 == 5)
            System.out.printf("%d 일은 금요일 입니다.\n", day);
        if (day % 7 == 6)
            System.out.printf("%d 일은 토요일 입니다.\n", day);
        if (day % 7 == 0)
            System.out.printf("%d 일은 일요일 입니다.\n", day);

        input.close();
    }
}
