package academy.DAY04;

public class EX19 {
    public static void main(String[] args){
        int[][] arrayInt9 = {{10}, {20, 30}, {40, 50, 60}, {70, 80, 90}};

        for (int i = 0; i < arrayInt9.length; i++){
            for (int j = 0; j < arrayInt9[i].length; j++){
                System.out.println(arrayInt9[i][j]);
            }
        }
    }
}
