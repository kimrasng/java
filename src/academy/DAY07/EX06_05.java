class Computer6 {
    String CPU = "AMD";
    String RAM = "Samsung";
    String SSD = "Samsung";


    Computer6() {
    }

    Computer6(String cpu) {
        CPU = CPU;
    }
}

public class EX06_05 {
    public static void main(String[] args) {
        Computer6 com1 = new Computer6("AMD");
        Computer6 com2 = new Computer6();

        System.out.println("CPU : " + com1.CPU);
        System.out.println("RAM : " + com1.RAM);
        System.out.println("SSD : " + com1.SSD);
        System.out.println();
        System.out.println("CPU : " + com2.CPU);
        System.out.println("RAM : " + com2.RAM);
        System.out.println("SSD : " + com2.SSD);
    }
}
