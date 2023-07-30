package academy.DAY08;

class Calc2 {
    public Calc2(String n) {
        System.out.println(n);
    }
}

class Computer_EX01_02 extends Calc2 {
    public Computer_EX01_02(String n) {
        super(n);
        System.out.println("Computer");
    }
}

public class EX01_02 {
    public static void main(String[] args) {
        Computer_EX01_02 com = new Computer_EX01_02("MyCalcurator");
    }
}
