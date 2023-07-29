class AnonPerson {
    void action() {
        System.out.println("공부 시작!");
    }
}

class Anonymous {
    AnonPerson A = new AnonPerson();

    void action() {
        System.out.println("식사 시작!");
    }

    void method() {
        AnonPerson B = new AnonPerson() {
            @Override
            void action() {
                System.out.println("운동 시작");
                action_2();
            }

            void action_2() {
                System.out.println("내일 부터야...");
            }
        };
        B.action();
    }
}

public class EX08_02 {
    public static void main(String[] args) {
        Anonymous anon = new Anonymous();
        anon.A.action();
        anon.action();
        anon.method();
    }
}
