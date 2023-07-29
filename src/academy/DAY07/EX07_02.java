package academy.DAY07;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

class Computer7 {
    String CPU;
    String RAM;
    String SSD;

    Computer7() {
        this.CPU = "Intel";
        this.RAM = "Samsung";
        this.SSD = "Samsung";
    }

    Computer7(String CPU) {
        this.CPU = CPU;
        this.RAM = "Samsung";
        this.SSD = "Samsung";
    }

    Computer7(String CPU, String RAM) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.SSD = "Samsung";
    }

    Computer7(String CPU, String RAM, String SSD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.SSD = SSD;
    }
}

public class EX07_02 {
    public static void main(String[] args) {
        Computer7 com1 = new Computer7();
        Computer7 com2 = new Computer7("AMD");
        Computer7 com3 = new Computer7("AMD", "SK");

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
