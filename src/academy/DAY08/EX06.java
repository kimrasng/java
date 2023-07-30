package academy.DAY08;

import java.util.Scanner;

abstract class Machine {
    Scanner input = new Scanner(System.in); // 오타 수정
    protected String Owner;
    protected String Serial;
    protected Machine(String Owner, String Serial) {
        this.Owner = Owner;
        this.Serial = Serial;
    }
    public abstract void turn0n();
    public abstract void machineInfo();
}

class Monitor extends Machine {
    public Monitor(String Owner, String Serial) {
        super(Owner, Serial);
    }

    @Override
    public void turn0n() {
        System.out.println("모니터 전원 On");
    }

    @Override
    public void machineInfo() {
        System.out.println("관리자 : " + this.Owner);
        System.out.println("관리번호 : " + this.Serial);
        System.out.println("전원을 키시겠습니까(y/n)? ");
        char flag = input.next().charAt(0);
        if (flag == 'y' || flag == 'Y'){
            turn0n();
        }
    }
}

class Com extends Machine {
    public Com(String Owner, String Serial) {
        super(Owner, Serial);
    }

    @Override
    public void turn0n() {
        System.out.println("컴퓨터 전원 On");
    }

    @Override
    public void machineInfo() {
        System.out.println("관리자 : " + this.Owner);
        System.out.println("관리 번호 : " + this.Serial);
        System.out.println("전원을 키시겠습니까?(y/n)?");
        char flag = input.next().charAt(0); // 입력 인덱스 수정
        if (flag == 'y' || flag == 'Y') {
            turn0n();
        }
    }
}

public class EX06 {
    public static void main(String[] args) {
        Monitor mo = new Monitor("Admin_1", "1-100");
        mo.machineInfo();
        System.out.println();
        Com com = new Com("Admin_2", "2-200");
        com.machineInfo();
    }
}
