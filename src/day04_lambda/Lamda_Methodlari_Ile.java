package day04_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lamda_Methodlari_Ile {
    public static void main(String[] args) {
        /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 arklı obj'den List create ediniz.
 */
        Universite bogazici = new Universite("bogazici", "matematik", 571, 93);
        Universite itu = new Universite("istanbul teknik", "matematik", 622, 81);
        Universite istanbul = new Universite("istanbul", "hukuk", 1453, 71);
        Universite marmara = new Universite("marmara", "bilgisayar muh", 1071, 77);
        Universite ytu = new Universite("yıldız teknik", "gemi", 333, 74);
        List<Universite> unv = new ArrayList<>(Arrays.asList(bogazici, itu, istanbul, marmara, ytu));

        notOrt(unv);
    }

    //not ortalamalari 74'den buyuk olan bir method creat edeniz

    public static void notOrt(List<Universite> univ){
        System.out.println(univ.stream().anyMatch(t -> t.getNotOrt() > 74));
    }

}
