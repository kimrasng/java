package academy.DAY03;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        
        // 윤년 평년
        int year;

        System.out.print("년도를 입력하시오: ");
        year = input.nextInt();

        if (year % 400 == 0)
            System.out.println(year + "년은 윤년입니다.");

        else if (year % 100 == 0)
            System.out.println(year + "년은 평년입니다.");

        else if (year % 4 == 0)
            System.out.println(year + "년은 윤년 입니다.");

        else
            System.out.println(year + "년은 평년 입니다.");


        
        // usb 가격을 출력
        int usb, money = 0;

        System.out.print("구입할 갯수를 입력하세요: ");
        usb = input.nextInt();


        if (usb > 0) {
            if (usb > 0) {
                money = usb * 5000;
            } else
                money = (usb * 5000) - (usb * 5000) / 10;
        }

        System.out.println("usb가격" + money);


        input.close();
    }
}
