package academy.DAY06;

class Variable2 {
    public int var = 100;
    public void variable() {
        System.out.println("var : " + var);
    }

    public void func() {
        System.out.println("var : " + var);
    }
}
public class EX12_02 {
    public static void main(String[] args) {
        Variable2 va = new Variable2();
        va.variable();
        va.func();
    }
}
