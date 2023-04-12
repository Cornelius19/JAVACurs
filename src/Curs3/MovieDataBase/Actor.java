package Curs3.MovieDataBase;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Actor {
    private String nume;
    private int varsta;
    private Premiu[] premii;

    public Actor(String nume, int varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", premii=" + Arrays.toString(premii) +
                '}';
    }
}
