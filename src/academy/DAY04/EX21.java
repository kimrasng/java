package academy.DAY04;

public class EX21 {
    public static void main(String[] args){
        int[] oldArrayint = {1, 2, 3};
        int[] newArrayint = new int[5];

        for (int i = 0; i < oldArrayint.length; i++){
            newArrayint[i] = oldArrayint[i];
        }
        for (int i = 0; i < newArrayint.length; i++){
            System.out.println(newArrayint[i]);
        }
    }
}
