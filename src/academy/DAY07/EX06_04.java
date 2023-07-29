class Computer4 {
    String CPU = "Intel";
    String RAM = "Samsung";
    String SSD = "Samsung";


    Computer4() {
    }

    Computer4(String cpu) {
        CPU = CPU;
    }
}

public class EX06_04 {
    public static void main(String[] args) {
        Computer4 com1 = new Computer4("AMD");
        Computer4 com2 = new Computer4();

        System.out.println("CPU : " + com1.CPU);
        System.out.println("RAM : " + com1.RAM);
        System.out.println("SSD : " + com1.SSD);
        System.out.println();
        System.out.println("CPU : " + com2.CPU);
        System.out.println("RAM : " + com2.RAM);
        System.out.println("SSD : " + com2.SSD);
    }
}
