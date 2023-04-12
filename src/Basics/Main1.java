package Basics;

import java.sql.Time;

public class Main1 implements Curs3,SmartWatch {
    @Override
    public String getTime(){
        return new Time(22,12,12).toString();
    }
    public void sendMail(){
        System.out.println("Trimite mailul");
    }

}
