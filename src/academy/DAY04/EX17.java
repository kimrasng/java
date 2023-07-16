package academy.DAY04;

public class EX17 {
    public static void main(String[] args){
        int[][] arrayInt7 = new int[3][];
        arrayInt7[0][0] = 10;
        // java.lang.NullPointerException

        // 가변 길이 배열
        arrayInt7[0] = new int[1];
        arrayInt7[1] = new int[2];
        arrayInt7[2] = new int[3];
        arrayInt7[0][0] = 10;
        System.out.println(arrayInt7[0][0]);
    }
}
