package day01_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Lambda {
    public static void main(String[] args) {

        /*
   1) Lambda "Functional Programming"-->mathod(action) kullanma pr dili.
      Lambda --> mathod create  etme değil mevcut method'ları(library)secip kullanmaktır...
      Lambda  kendi başına tanımlanabilen parametre alıp gönderebilen fonksiyonlardır.
      Lambda'lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.
      Java 8 ile gelen bu özellik, Java 8’in en önemli özelliğidir.

      "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
   2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
   3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
       ve hatasiz code yazma acilarindan cok faydalidir.
   4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullanılmaz.
      Lambda kullanmak hatasız code kullanmaktır.

          Collections Nedir?
          Çoğu yazılım tek tek öğeler yerine öğelerden oluşan toplulukları depolar ve onlar üzerinde işlem
          yapar. Array'ler onlardan birisidir. Java Collections Framework, arraylerle yapılan işleri daha kolay
          yaptığı gibi, daha fazlasını da yapar.
          Java'da bir koleksiyon (collection - bazen container, ambar diye adlandırılır) nesnelerden oluşan bir
          topluluğu bir arada tutan bir yapıdır. 'Collections Framework' ise arayüzler ve onların kurgularından
          (implementations) oluşur.
*/
        List<Integer> sayi=new ArrayList<>(Arrays.asList(34,22,16,11,35,20,63,21,65,44,66,64,81,38,15));
        //Task Structer pragrming kulllanarak list elamanlari ayni satirda  aralarinda bosluk birakarak  prinnt ediniz
      //  printStructer(sayi);
        lambdaPrintStructer(sayi);//Sayilar  : 34 22 16 11 35 20 63 21 65 44 66 64 81 38 15
        System.out.println("***");
        lambdaPrintStructer_1(sayi);//Sayilar  : 342216113520632165446664813815
        System.out.println("***");
        lambdaPrintStructer_2(sayi);
        System.out.println("***");
        printCiftElFunctinal_1(sayi);
        System.out.println("***");
        printCiftElFunctinal_2(sayi);
        System.out.println("***");
        printCiftElFunctinal_3(sayi);
        System.out.println("***");


        }
    public static void printStructer(List<Integer> sayi){
        for (Integer each : sayi
             ) {
            System.out.print(each+" ");
        }
        //Task Structer pragrming kulllanarak list elamanlari ayni satirda  aralarinda bosluk birakarak  prinnt ediniz

    }
    public static  void  lambdaPrintStructer(List<Integer> sayi){
        System.out.print("Sayilar  : ");
        sayi.
                stream().
                forEach(t-> System.out.print(t+" "));
    }
/*
 stream() : datalari yukaridan asagiya akis sekline getirir. Stream bir interface olduğundan dolayı doğrudan nesne almaz.
 forEach() :datanin parametresine gore her bir elemanı isler
 t-> : Lambda operatoru
  Lambda Expression-->(parameter list) -> {action body}
      Parameter list: Fonksiyonun parametreleri tanımlanır. Hiç parametre geçirmeden boşta olabilir.
      -> Arrow-token: Argüman listesi ile expression gövdesini birbirine bağlamak için kullanılır.
      Body: Expressionları ve statementları içerir.

     Bir kod bloğundan oluşan bir body...
     Bu tip lambda body, block body olarak bilinir. Blok gövdesi, lambda gövdesinin birden çok ifade içermesine izin verir.
     Bu ifadeler parantez içine alınır ve parantezlerden sonra noktalı virgül eklemeniz gerekir.

         () -> {
          double pi = 3.1415;
             return pi;
         };
  Lambda Expression  yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir

 */
public static  void  lambdaPrintStructer_1(List<Integer> sayi){
    System.out.print("Sayilar  : ");
    sayi.
            stream().
            forEach( System.out::print);//method referans  -->System.out yapisindan  print method'u refee et

}
public  static void yazdir(int a ){
    System.out.print(a+" ");//verilen int degeri ayni satirda
}
    public static  void  lambdaPrintStructer_2(List<Integer> sayi){
        System.out.print("Sayilar  : ");
        sayi.
                stream().
                forEach( C01_Lambda::yazdir);//method referans  -->System.out yapisindan  print method'u refee et
                                                   //Sayilar  : 34 22 16 11 35 20 63 21 65 44 66 64 81 38 15
    }

    //structured Programming ile list elemanlarinin  cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printCiftElSturctured(List<Integer> sayi){
        for (Integer w:sayi) {
            if(w%2==0)
            {  System.out.print(w+" ");}
        }
    }

    //structured Programming ile list elemanlarinin  cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printCiftElFunctinal_1(List<Integer> sayi){
      sayi.
              stream().
              filter(t->t%2==0).
              forEach(C01_Lambda::yazdir);
}
   public static  boolean ciftbul(int a){
    return a%2==0;
   }
    public static void printCiftElFunctinal_2(List<Integer> sayi){
        sayi.
                stream().
                filter(C01_Lambda::ciftbul).
                forEach(C01_Lambda::yazdir);
    }
    public static void printCiftElFunctinal_3(List<Integer> sayi){
        sayi.
                stream().
                filter(t->t<34).filter(t->t%2==0).
                forEach(C01_Lambda::yazdir);
    }
}
