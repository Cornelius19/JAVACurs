package Curs4.builder;

public class Main {
    public static void main(String[] args) {
        Computer.Builder comp = new Computer.Builder("Asus","Ryzen7")
                .setBattery(422)
                .setColor("red")
                .setGPU("Ncidia")
                .setRAM(12312)
                .setStorage(123123);
        System.out.println(comp.toString());




    }
}
