package academy.DAY07;

class A {
    A() {
        System.out.println("상위 클래스 A 객체 생성");
    }
    class B {
        B() {
            System.out.println("인스턴스 클래스 B 객체 생성");
        }
            int field1;
            void method1() {
                System.out.println("인스턴스 클래스 B 메서드");
            }
    };

    static class C {
        C() {
            System.out.println("정적 클래스 C 객체 생성");
        }
            int field1;
            void method1() {
                System.out.println("정적 클래스 C 메서드");
            }
        };
        void method() {
        class D {
            D() {
                System.out.println("로컬 클래스 D 객체 생성");
            }
            int field1;
            void method1() {
                System.out.println("로컬 클래스 D메서드");
            }
        };
    }
}

public class EX08_01 {
    public static void main(String[] args) {

    }
}
