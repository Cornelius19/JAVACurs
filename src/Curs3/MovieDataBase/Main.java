package Curs3.MovieDataBase;

public class Main {
    public static void studioCuMaiMulteDe2Filme(Studio[] studios){
        for (int i = 0; i < studios.length;i++){
            if (studios[i].getFilme().length>2){
                System.out.println(studios[i]);
            }
        }

    }
    public static void main(String[] args) {
        Premiu p1 = new Premiu("Oscar",2020);
        Actor a1 = new Actor("Ionel",30,new Premiu[]{p1});
        //System.out.println(a1);

        Film f1 = new Film(2022,"CeVA",new Actor[]{a1});
        Film f2 = new Film(2020,"Joh",new Actor[]{a1});
        Film f3 = new Film(2025,"Poc",new Actor[]{a1});
        Studio s1 = new Studio("20Cent",new Film[]{f1});
        Studio s2 = new Studio("20Cent",new Film[]{f2});
        Studio s3 = new Studio("20Cent",new Film[]{f1,f2,f3});

        Studio[] studios = new Studio[]{s1,s2,s3};

        studioCuMaiMulteDe2Filme(studios);

       // System.out.println(s1);
    }


}
