package academy.DAY06;

class Variable4 {
    public static int var = 100;
    public void variable() {
        System.out.println("var : " + var);
    }

    public void func() {
        System.out.println("var : " + var);
    }
}
public class EX12_04 {
    public static void main(String[] args) {
        Variable4.var = 500;
        Variable4 va = new Variable4();
        va.variable();
        va.func();
    }
}
