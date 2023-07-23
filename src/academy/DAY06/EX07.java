package academy.DAY06;

class MethodOverLoading_01 {
    public int mtSum(int su1, int su2) {
        return su1 + su2;
    }
    public double mtSum(double su1,double su2){
        return su1 + su2;
    }
}
public class EX07 {
    public static void main(String[] args) {
        MethodOverLoading_01 MtOver = new MethodOverLoading_01();
        System.out.println("결과 : " + MtOver.mtSum(10, 10));
        System.out.println("결과 : " + MtOver.mtSum(10.11, 20.22));
    }
}
