package Curs3.overflow;

public class Dog {
    public void bark(){
        barkmany(1);
    }
    public void barkmany(int n){
        for (int i = 0;i < n;i++)
            System.out.println("bau");

    }
}
