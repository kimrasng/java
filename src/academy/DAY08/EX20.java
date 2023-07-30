package academy.DAY08;

import java.util.ArrayList;
import java.util.Scanner;

public class EX20 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("김상수");
        list.add("이변수");
        list.add("박참조");
        list.add("조클래스");
        list.add("지컬렉션");
        System.out.println(list);

        Scanner input = new Scanner(System.in);
        System.out.println("값을 변경 할 위치 : ");
        int index = input.nextInt();

        System.out.println("변경 할 값 : ");
        String element = input.next();
        list.set(index, element);
        input.close();
        System.out.println(list);
    }
}
