package day04_lambda;

public class Universite {
    /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method
           içinde 5 arklı obj'den List create ediniz.
 */
    String Universite;
    String bolum;
    int ogrcSayisi;
    int notOrt;


    public String getUniversite() {
        return Universite;
    }

    public void setUniversite(String universite) {
        Universite = universite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrcSayisi() {
        return ogrcSayisi;
    }

    public void setOgrcSayisi(int ogrcSayisi) {
        this.ogrcSayisi = ogrcSayisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }



    public Universite(String universite, String bolum, int ogrcSayisi, int notOrt) {
        Universite = universite;
        this.bolum = bolum;
        this.ogrcSayisi = ogrcSayisi;
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return "C01_Lamda_Method_Day_04{" +
                "Universite='" + Universite + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrcSayisi=" + ogrcSayisi +
                ", notOrt=" + notOrt +
                '}';
    }
}
