package academy.DAY03;

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int kor, eng, math, result;

        System.out.println("국어 점수 입력: ");
        kor = input.nextInt();

        System.out.println("영어 점수 입력: ");
        eng = input.nextInt();

        System.out.println("수학 점수 입력: ");
        math = input.nextInt();

        result = (kor + eng + math) / 3;

        if (result < 70)
            System.out.println("불합격(평균 점수 미달)");
        else if (kor < 60)
            System.out.println("불합격(국어 점수 미달)");
        else if (eng < 60)
            System.out.println("불합격(영어점수 미달)");
        else if (math < 60)
            System.out.println("불합격(수학점수 미달)");
        else
            System.out.println("합격!");

        input.close();
    }
}
