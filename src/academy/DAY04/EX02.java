package academy.DAY04;

public class EX02 {
    public static void main(String[] args){
        int a, b;

        // 가로출력
        for (a=2; a<=9; a++){
            for (b=1; b<=9; b++){
                System.out.print(a + "x" + b + "=" + a*b + "\t");
            }
            System.out.println();
        }
        System.out.println("\n\n\n\n");

        // 세로출력
        for (a=1; a<=9; a++){
            for (b=2; b<=9; b++){
                System.out.print(b + "x" + a + "=" + a*b + "\t");
            }
            System.out.println();
        }
    }
}
