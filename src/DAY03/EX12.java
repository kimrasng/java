package DAY03;

public class EX12 {
    public static void main(String[] args){

        int odd_sum = 0, even_sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                odd_sum += i;
            else
                even_sum += i;
        }

        System.out.println("1~10 짝수 합:" + odd_sum);
        System.out.println("1~10 홀수 합:" + even_sum);
    }
}