package academy.DAY07;

class Computer2 {
    String CPU = "Intel";
    String RAM = "Samsung";
    String SSD = "Samsung";

    Computer2(String setCPU) {
        CPU = setCPU;
    }
}
public class EX06_02 {
    public static void main(String[] args) {
//        Computer2 com = new Computer2();
        Computer2 com = new Computer2("AMD");
        System.out.println("CPU : " + com.CPU);
        System.out.println("RAM : " + com.RAM);
        System.out.println("SSD : " + com.SSD);
    }
}
