package academy.DAY08;

import java.util.ArrayList;
import java.util.Scanner;

public class EX18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Test");
        arr.add("String");
        System.out.println(arr.contains("Test"));
        System.out.println(arr.contains("String"));
        System.out.print("검색 데이터 입력 : ");
        String serachData = input.next();
        if (arr.contains(serachData)) {
            System.out.println(serachData + "데이터가 존재합니다.");
        } else {
            System.out.println(serachData + "데이터가 존재하지 않습니다.");
        }
        input.close();
    }
}
