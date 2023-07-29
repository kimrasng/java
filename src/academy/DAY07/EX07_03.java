package academy.DAY07;

import javax.print.DocFlavor;

class Computer8 {
    String CPU;
    String RAM;
    String SSD;

    Computer8() {
        this("Intel", "Samsung", "Samsung");
    }
    Computer8(String CPU) {
        this(CPU, "Samsung", "Samsung");
    }

    Computer8(String CPU, String RAM){
        this(CPU, RAM, "Samsung");
    }

    Computer8(String CPU, String RAM, String SSD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.SSD = SSD;
    }


}


public class EX07_03 {
    public static void main(String[] args) {
        Computer8 com1 = new Computer8();
        Computer8 com2 = new Computer8("AMD");
        Computer8 com3 = new Computer8("AMD", "SK");

        System.out.println("CPU : " + com1.CPU);
        System.out.println("RAM : " + com1.RAM);
        System.out.println("SSD : " + com1.SSD);
        System.out.println();

        System.out.println("CPU : " + com2.CPU);
        System.out.println("RAM : " + com2.RAM);
        System.out.println("SSD : " + com2.SSD);
        System.out.println();

        System.out.println("CPU : " + com3.CPU);
        System.out.println("RAM : " + com3.RAM);
        System.out.println("SSD : " + com3.SSD);
        System.out.println();
    }
}
