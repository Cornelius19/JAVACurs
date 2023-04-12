package Curs3.MovieDataBase;

import java.util.Arrays;

public class Film {
    private int anAparitie;
    private String name;
    private Actor[] actori;

    public Film(int anAparitie, String name, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.name = name;
        this.actori = actori;
    }

    @Override
    public String toString() {
        return "FIlm{" +
                "anAparitie=" + anAparitie +
                ", name='" + name + '\'' +
                ", actori=" + Arrays.toString(actori) +
                '}';
    }
}
