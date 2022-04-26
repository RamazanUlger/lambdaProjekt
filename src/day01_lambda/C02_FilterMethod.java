package day01_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_FilterMethod {
    public static void main(String[] args) {
        List<Integer> sayi=new ArrayList<>(Arrays.asList(34,22,16,11,35,20,63,21,65,44,66,64,81,38,15));
        ciftAyniSatir(sayi);
        System.out.println();
        oylesine(sayi);

    }

    //structured Programming ile list elemanlarinin  cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printCiftElSturctured(List<Integer> sayi) {
        for (Integer w : sayi) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //structured Programming ile list elemanlarinin  cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printCiftElFunctinal_1(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 == 0).
                forEach(C01_Lambda::yazdir);
    }

    public static boolean ciftbul(int a) {
        return a % 2 == 0;
    }

    public static void printCiftElFunctinal_2(List<Integer> sayi) {
        sayi.
                stream().
                filter(C01_Lambda::ciftbul).
                forEach(C01_Lambda::yazdir);
    }

    public static void printCiftElFunctinal_3(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t < 34).filter(t -> t % 2 == 0).
                forEach(C01_Lambda::yazdir);
    }

    public static void yazdir(int a) {
        System.out.print(a + " ");//verilen int degeri ayni satirda
    }

    public static void lambdaPrintStructer_2(List<Integer> sayi) {
        System.out.print("Sayilar  : ");
        sayi.
                stream().
                forEach(C01_Lambda::yazdir);//method referans  -->System.out yapisindan  print method'u refee et
        //Sayilar  : 34 22 16 11 35 20 63 21 65 44 66 64 81 38 15
    }
      //Task : functional Programming ile list elemanlarinin 34
      // den buyk veya cift olanalrini ayni satirda aralarina
      // bosluk birakarak print ediniz
    public  static void ciftAyniSatir(List<Integer> sayi){
      sayi.
              stream().
              filter(t->t>34 || t%2==0).
              forEach(C02_FilterMethod::yazdir);
    }
public
static void oylesine(List<Integer> sayi){

}

}

