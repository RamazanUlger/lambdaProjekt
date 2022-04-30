package day04_lambda;

import day01_lambda.C01_Lambda;

import java.util.*;
import java.util.stream.Stream;

public class C01_LambdaMethod_2 {
    public static void main(String[] args) {
        List<String> menü=new ArrayList<>(Arrays.asList("Elma","Waffle","Armut","Adana","Havuc Dilimi","Buryan Kebabi","Yaglama","Kokorec","Arabasi","Guvec"));



        //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda
        // false return eder.

        //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman #
        // sarti saglamazsa false return eder.

        //noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman
        // sarti SAGLARSA false return eder.




        //*************SKIP()*********************
        //skip(1) => atlama demek.
        // Akışın ilk n elemanını attıktan sonra bu akışın kalan
        // elemanlarından oluşan bir akış return eder.
        // Bu akış n'den daha az öğe içeriyorsa, boş bir akış döndürülür.
        // Bu, durum bilgisi olan bir ara işlemdir.
        //skip(list.size()-1) => List'in uzunluğunun 1 eksiğini yazarsak
        // son elemanı yazdırırız.

        //*************LIMIT()*********************

        //limit(1) => Sınırlandırma demek. Bu akışın elemanlarından oluşan,
        // uzunluğu maxSize'dan uzun olmayacak
       // şekilde kesilmiş bir akış return eder. Stream return eder.



    }

    // Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.

    public static void harfSayisi7denAzKontrol(List<String> menü) {
//amele code
        System.out.println("amele code");
        boolean kontrol = menü.stream().allMatch(t -> t.length() <= 7);
        if (kontrol) {
            System.out.println("list elemanları 7 ve daha az harften olusuyor");
        } else System.out.println("list elemanları 7 harften  buyuk");
//cincix code
        System.out.println("cincix code");
        System.out.println(menü.
                stream().
                allMatch(t -> t.length() <= 7) ? "list elemanları 7 ve daha az harften olusuyor" : "list elemanları 7 harften  buyuk");
    }

    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
    public static void wIleBaslayanElKontrol(List<String> menü) {
        System.out.println(menü.
                stream().
                noneMatch(t -> t.startsWith("w")) ? "agam w ile başlayan yemahh olu mu ?" :
                "agam  wenemen ne menen bi şey  ?");

    }

    // Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.

    public static void xIleBitenElKontrol(List<String> menü) {
        System.out.println(menü.
                stream().
                anyMatch(t -> t.endsWith("x")) ? "agam senden bir  cacix olmaz  ?" :
                "agam senin aradigin yemek bu torpaklarda yooogggg");

    }

    // Task : Karakter sayisi en buyuk elemani yazdiriniz.

    public  static void charSayisiBykElPrint_2(List<String> menü){
        System.out.println(menü.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).
                        reversed()).
                findFirst());

        // akıs cıktısını bir veriable assaign edilebilir
        Optional<String> enBykKrEl= menü.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).
                        reversed()).
                findFirst();
    }
    //list'deki son harfleri son harfine gore siralayip
    // ilk elman haric kalanlari print ediniz.
    public static void sonHarfineGoreSirala(List<String> menü){
        menü.stream().sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).skip(1).forEach(t-> System.out.println(t+" "));

    }

    // Task : Karakter sayisi en buyuk elemani yazdiriniz.

    public  static void charSayisiBykElPrint(List<String> menü){
        Stream<String> sonIsim;

        System.out.println(
     sonIsim=  menü.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).
                        reversed()).
                //   findFirst();//ilk eleman alındı
                        limit(1));
        System.out.println(Arrays.toString(sonIsim.toArray()));//(sonIsim.toArray()
        // --> method'u retun'den dolayi stream type olan
        //  sonIsim toArray() method ile array type convert edildi.
        /*
       TRİCK : Stream'ler ekrana direk yazdırılamaz. Stream'i toArray()
       ile Array'e çeviririz. Array'i de Arrays.toString() 'in içine alıp yazdırabiliriz.
       Ör; System.out.println(Arrays.toString(stream.toArray()));
       veya System.out.println(Arrays.asList(***.toArray())); kullanılabilir.

      */

//*************************************************************************************************************

        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.
         //limit(1) => Sınırlandırma demek. Bu akışın elemanlarından oluşan, uzunluğu maxSize'dan uzun olmayacak
         // şekilde kesilmiş bir akış return eder. Stream return eder.
        // akıs cıktısını bir veriable assaign edilebilir
//**************************************************************************************************************
        Optional<String> enBykKrEl= menü.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).
                        reversed()).
                findFirst();//ilk eleman alındı

    }

    // Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void ilkElHarcSonHrfSiraliPrint(List<String> menü){

        menü.
                stream().//akısa alındı
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//son harfe göre sıralandı
                skip(1).//ilk eleman atlandı -->adana
                forEach(t-> System.out.print(t + " "));//print edildi
        //skip(1) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
        // Bu akış n'den daha az öğe içeriyorsa, boş bir akış döndürülür. Bu, durum bilgisi olan bir ara işlemdir.
        //skip(list.size()-1) => List'in uzunluğunun 1 eksiğini yazarsak son elemanı yazdırırız.
    }


}
