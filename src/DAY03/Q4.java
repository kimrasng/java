package DAY03;

public class Q4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        // 1부터 시작하여 홀수의 합을 구하고, 그 합이 10000을 넘지 않는 마지막 홀수값을 구하시오.
//		int i, sum=0;
//		for(i=1; sum<10000; i++) {
//			if (i % 2 == 1)
//				sum += i;
//		}
//		i--;
//		System.out.println("마지막 더해진 홀수: " + i);



        // 1부타 시작하여 홀수의 합을 구하고, 그 합이 25를 넘지 않는 마지막 홀수 값을 구하시오(+ 부연)
//		int i, sum=0;
//		for(i=1; sum<25; i++) {
//			if (i % 2 == 1)
//				sum += i;
//		}
//		i--;
//		System.out.println("마지막 더해진 홀수: " + i);
//
//

        // 1에서 1000까지의 자연수중 4로 나누어도 6으로 나누어도 나머지가 1인 수의 합을 출력하라.
//		int i, sum=0;
//		for (i=1; i<=1000; i++) {
//			if (i % 4 == 1 && i % 6 == 1)
//				sum += i;
//			}
//		System.out.println(sum);
//


        // 입력받은 수의 약수를 구하는 코드를 작성하시오.

//		Scanner input = new Scanner(System.in);
//		int num;
//		System.out.print("수입력: ");
//		num = input.nextInt();
//		int i;
//		for (i=1; i <= num; i++) {
//			if (num % i == 0)
//				System.out.print(i+" ");
//		}
//		input.close();

        //1 ~ 1000까지의 합을 구하는 코드를 작성하시오.
        int sum = 0, sum1 = 0;
        for (int i=1; i<=1000; i++) {
            if(i % 3 == 0 && i % 5 != 0)
                sum1 += i;
            sum += i;
        }
        sum = sum - sum1;
        System.out.println("합: " + sum);

    }

}
