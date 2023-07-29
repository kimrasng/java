package academy.DAY07;


class Computer6 {
    String CPU = "Intel";
    String RAM = "Samsung";
    String SSD = "Samsung";

    Computer6() {}

    Computer6(String CPU) {
        this.CPU = CPU;
    }
    Computer6(String CPU, String RAM) {
        this.CPU = CPU;
        this.RAM = RAM;
    }
}

public class EX07_01 {
    public static void main(String[] args) {
        // com1 > 기본값
        Computer6 com1 = new Computer6();
        // com2 > CPU(AMD로 변경)
        Computer6 com2 = new Computer6("AMD");
        // com3 > CPU(AMD로 변경) RAM(SK로 변경)
        Computer6 com3 = new Computer6("AMD", "SK");

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
