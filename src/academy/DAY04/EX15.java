package academy.DAY04;

public class EX15 {
    public static void main(String[] args) {
        // 1 ~ 100까지 정수 값 배열에 담기
        int hap = 0;

        int[] arraynum1 = new int[100];
        for (int i = 0; i < arraynum1.length; i++) {
            arraynum1[i] = i + 1;
        }
        // 1 ~ 100까지 정수 값 꺼내서 출력

        for (int i = 0; i < arraynum1.length; i++) {
            System.out.println(arraynum1[i]);
        }
        // 1 ~ 100까지 정수 합 구하여 출력
        for (int i = 0; i < arraynum1.length; i++) {
            hap += arraynum1[i];
        }


        // 배열 + for 문 사용

        System.out.println(hap);
    }
}
