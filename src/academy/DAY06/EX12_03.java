package academy.DAY06;

class Variable3 {
    public int var = 100;
    public void variable() {
        System.out.println("var : " + var);
    }

    public void func() {
        System.out.println("var : " + var);
    }
}
public class EX12_03 {
    public static void main(String[] args) {
//        Variable3.var = 500;
        Variable3 va = new Variable3();
        va.variable();
        va.func();
    }
}
