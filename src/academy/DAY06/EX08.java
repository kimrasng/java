package academy.DAY06;

import java.util.Scanner;
class MethodOverloading_02 {
    // 정사각형 넓이 구하는 메소드
    public double area (double width) {
        return width*width;
    }
    // 직사각형 구하는 메소드
    public double area(double width, double height) {
        return width * height;
    }

}

public class EX08 {
    public static void main(String[] args) {
        // 사요자로 부터 가로 세로 길이값 입력받아서 정, 직각형 넓이 출력
        Scanner input = new Scanner(System.in);
        MethodOverloading_02 MtOver = new MethodOverloading_02();
        System.out.print("사각형 가로 길이 입력 : ");
        double width = input.nextDouble();
        System.out.print("사각형 세로 길이 입력 : ");
        double height = input.nextDouble();
        input.close();
        System.out.println("정사각형의 넓이 : " + MtOver.area(width));
        System.out.println("직사각형의 넓이 : " + MtOver.area(width, height));


    }
}
