package day03_lambda;

import day01_lambda.C01_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C02_LambdaString {
    public static void main(String[] args) {
        List<String> strList=new ArrayList<>(Arrays.asList("Elma","Armut","Adana","Havuc Dilimi","Buryan Kebabi","Yaglama","Kokorec","Arabasi","Guvec"));

// Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..

// Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
// Task : list elemanlarinin son harfine gore ters sirali print ediniz.
// Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz..
// Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
// Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
// Task : List elelmanlarinin "x" ile biten en az bir elemaı kontrol ediniz.
// Task : Karakter sayisi en buyuk elemani yazdiriniz.
// Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    alfabetikBuyukHarfTekrarsiz(strList);
        System.out.println();
        System.out.println("*");
        karakterSayisinaGoreTersList(strList);
        System.out.println("**");

    }
    // Task : List elemanlarini alafabetik buyuk harf ve
    // tekrarsiz print ediniz.

    public static  void alfabetikBuyukHarfTekrarsiz(List<String> list){
        list.stream().
                map(String::toUpperCase).
                sorted().
                distinct().
                forEach(t-> System.out.print(t+" "));
    }
    //distinct() => Bu method tekrarlı elemanları sadece bir kere yazdırır.
    // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan
    // bir akış döndürür.
    // Sıralı akışlar için, farklı elemanın seçimi sabittir
    // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
    // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez.
    // Stream return eder.

    //********************************************************************
    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..

    public static void karakterSayisinaGoreTersList(List<String> list){

        list.stream().
                map(String::length).
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(C01_Lambda::yazdir);

                list.stream().//akısa alındı
               // map(t->t.length()).
                map(String::length).//elemanlar karakter sayısına update edildi
                sorted(Comparator.reverseOrder()).//ter sıra yapıldı
                distinct().//benzersiz yapıldı
                //forEach(t->System.out.print(t+" "));
                forEach(C01_Lambda::yazdir);//print edil

    }

        // Task : List elemanlarini character sayisina gore kckten byk e gore print e
          public static void karakterSayisinaGoreKucuktenBuyuge(List<String> list){
              list.stream().
                      map(String::length).
                      sorted(Comparator.reverseOrder()).
                      distinct().
                      forEach(C01_Lambda::yazdir);
          }
          //List elemanlarini son harfine gore buyukten kucuge ters siralama
    public static void sonharfeGoreBuyuktenKucuge(List<String> list){
       //list.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().charAt(t.toString().length()-1))).reversed().
        list.
                stream().
                sorted(Comparator.
                        comparing(t->t.toString().
                                charAt(t.toString().length()-1)).
                        reversed()).
                forEach(t->System.out.print(t+" "));
    }
}
