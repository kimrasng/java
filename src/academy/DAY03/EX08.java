package academy.DAY03;

import java.util.Scanner;

public class EX08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int selete;

        System.out.print("1~3 숫자를 입력하세요: ");
        selete = input.nextInt();

        switch (selete) {
            case 1: System.out.println("입력한수: " + selete); break;   // Cass 의 종속문장 끝 break 문을 함께 작성하지 않을 경우 하위 Cass 를 전부 실행한다.
            case 2: System.out.println("입력한수: " + selete); break;   // Cass 는 단지 시작점을 표시하는 용도로 사용 될 뿐 명확한 영역구분이 불가능하다.
            case 3: System.out.println("입력한수: " + selete); break;
            default: System.out.println("1~3외 다른 수 입력");
        }

        input.close();
    }
}
