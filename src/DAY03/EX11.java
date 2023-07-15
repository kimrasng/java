package DAY03;

public class EX11 {
    public static void main(String[] args){
        for (int i = 1; i <= 25; i++){
            System.out.print(i + "\t");
            if (i % 5 == 0){
                System.out.println();
            }
        }
        for (int i = 1; i <= 25; i++){
            if (i % 5 == 0)
                System.out.println(i);
            else
                System.out.print(i + "\t");
        }
    }
}
