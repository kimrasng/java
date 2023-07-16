package academy.DAY04;

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int kor;

        while (true) {
            System.out.println("국어 점수 입력: ");
            kor = input.nextInt();
            if (kor > 100 || kor < 0)
                System.out.println("0~100점 사이 값을 입력하세요.");
            else {
                System.out.println("국어 점수: " + kor);
                break;
            }
        }
        input.close();
    }
}
