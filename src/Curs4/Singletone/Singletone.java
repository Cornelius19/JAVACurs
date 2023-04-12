package Curs4.Singletone;

public class Singletone {
    private Singletone(){}
    private static Singletone instance;

    public static Singletone getInstance() {
        if (instance == null)
            instance = new Singletone();
        return instance;
    }
}
