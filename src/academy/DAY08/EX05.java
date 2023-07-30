package academy.DAY08;

import java.util.Scanner;

class A {
    protected String str;
    public A(String str) {
        this.str = str;
    }

    // 주석처리된 final 메소드
    // public final void Method1() {
    public void Method1() {
        System.out.println("Parent Class!");
    }
}

class B extends A {
    public B(String str) {
        super(str);
    }
    @Override
    public void Method1() {
        if (super.str.equals("Parent")) {
            super.Method1();
        }
        else {
            System.out.println("Child Class");
        }
    }
}

public class EX05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Parents or Child Input : ");
        String input = scanner.nextLine();
        B obj = new B(input);
        obj.Method1();
    }
}
