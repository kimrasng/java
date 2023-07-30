package academy.DAY08;

class Upcasting_P {
    public String name;
    Upcasting_P(String name) {
        this.name = name;
    }
    public void getClassName() {
        System.out.println(name);
    }
}

class Upcasting_C1 extends Upcasting_P {
    Upcasting_C1(String name) {
        super(name);
    }
    public void getClassName() {
        System.out.println(name);
    }
}

class Upcasting_C2 extends Upcasting_P {
    Upcasting_C2(String name) {
        super(name);
    }
    public void getClassName() {
        System.out.println(name);
    }
    public void Child_No2() {
        System.out.println("child_No2_Method!");
    }
}

public class EX07 {
    public static void main(String[] args) {
        Upcasting_P upcasting;
        upcasting = new Upcasting_P("Parents");
        upcasting.getClassName();

        upcasting = new Upcasting_C1("Child1");
        upcasting.getClassName(); // 출력: Child1

        upcasting = new Upcasting_C2("Child2");
        upcasting.getClassName(); // 출력: Child2

        // 다운캐스팅
        if (upcasting instanceof Upcasting_C2) {
            Upcasting_C2 child2 = (Upcasting_C2) upcasting;
            child2.Child_No2(); // 출력: child_No2_Method!
        }
    }
}
