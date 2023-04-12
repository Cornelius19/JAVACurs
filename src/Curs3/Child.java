package Curs3;

public class Child extends Parent{
    public void displaySecret(){
        System.out.println("This is the secret of the child");
    }

    public void displaySecret2(){
        super.displaySecret();
        System.out.println("This is the secret no 2 of the child");
    }


}
