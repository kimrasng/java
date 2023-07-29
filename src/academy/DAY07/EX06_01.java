package academy.DAY07;

class Computer1 {
    String CPU = "Intel";
    String RAM = "Samsung";
    String SSD = "Samsung";

    Computer1() {}
}
public class EX06_01 {
    public static void main(String[] args) {
        Computer1 com = new Computer1();
        System.out.println("CPU : " + com.CPU);
        System.out.println("RAM : " + com.RAM);
        System.out.println("SSD : " + com.SSD);
    }
}
