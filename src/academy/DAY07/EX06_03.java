class Computer3 {
    String CPU = "Intel";
    String RAM = "Samsung";
    String SSD = "Samsung";


    Computer3() {
    }

    Computer3(String cpu) {
        CPU = cpu;
    }
}

public class EX06_03 {
    public static void main(String[] args) {
        Computer3 com1 = new Computer3("AMD");
        Computer3 com2 = new Computer3();

        System.out.println("CPU : " + com1.CPU);
        System.out.println("RAM : " + com1.RAM);
        System.out.println("SSD : " + com1.SSD);
        System.out.println();
        System.out.println("CPU : " + com2.CPU);
        System.out.println("RAM : " + com2.RAM);
        System.out.println("SSD : " + com2.SSD);
    }
}
