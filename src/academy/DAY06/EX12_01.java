package academy.DAY06;

class Variable1 {
    public void variable() {
        int var = 100;
        System.out.println("var : " + var);
    }

    public void func() {
//        System.out.println("var : " + var);
    }
}
public class EX12_01 {
    public static void main(String[] args) {
        Variable1 va = new Variable1();
        va.variable();
        va.func();
    }
}
