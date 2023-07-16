package academy.DAY04;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr[] = new int[] {10, 54, 13, 17, 25, 30};
        String odd_even = null;
        System.out.print("짝수, 홀수입력 : ");
        odd_even = input.next();
        
        if (odd_even == "짝수"){
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            System.out.println(arr[6]);
        } else if (odd_even == "홀수") {
            System.out.println(arr[3]);
            System.out.println(arr[4]);
            System.out.println(arr[5]);
        }else {
            System.out.println("짝수 또는 홀수로 입력하여 주세요");
        }

        input.close();
    }
}
