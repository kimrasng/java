package academy.DAY04;

public class EX16 {
    public static void main(String[] args){
        int [][] arrayInt6 = new int[3][4];
        // arrayInt6[0] = 10;
        // Type mismatch: cannot convert from int to int[]
        arrayInt6[0][0] = 10;
        System.out.println(arrayInt6[0][0]);




    }
}
