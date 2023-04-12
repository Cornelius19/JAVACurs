package Curs4.Singletone;

public class Main {
    public static void main(String[] args) {
        // nu se poate ca e privat constSingletone s = new Singletone();
        Singletone s = Singletone.getInstance();
        System.out.println(s);
        Singletone s1 = Singletone.getInstance();
        System.out.println(s1);
    }

}
