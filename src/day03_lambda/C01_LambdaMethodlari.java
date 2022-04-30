package day03_lambda;

import day01_lambda.C01_Lambda;
import day01_lambda.C02_FilterMethod;
import day02_lambda.Lambda_Method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C01_LambdaMethodlari {
    public static void main(String[] args) {




        List<Integer> sayiList = new ArrayList<>(Arrays.asList(4, 2, 6, 17,
                -5, 9, 7, 5));
        dorFarkliYontemiIleYazdirma(sayiList);
        System.out.println();
        bestenBuyukEnKucukTekSayi(sayiList);
        System.out.println();
        ciftKareKucuktenBuyuge(sayiList);
        System.out.println();
        tekKareBuyuktenKucuge(sayiList);

    }
    // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.
//1. yontem Method Reference --> Integer class
//2. yontem Method Reference --> Math class
//3. yontem Lambda Expression
//4. yontem Method Reference --> Haluk class

    public static void dorFarkliYontemiIleYazdirma(List<Integer> sayi) {
        System.out.println("*");
        System.out.println(sayi.stream().reduce(Integer::min));
        System.out.println(sayi.stream().reduce(Math::min));
        System.out.println(sayi.stream().reduce(Integer.MIN_VALUE, (a, b) -> a < b ? a : b));
        System.out.println(sayi.stream().reduce(Lambda_Method::minElemanBul));
    }
    // Task : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void bestenBuyukEnKucukTekSayi(List<Integer> sayi){
        System.out.println("**");
        System.out.println(sayi.stream().filter(t -> t > 5 && t % 2 == 1));
    }
    // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void ciftKareKucuktenBuyuge(List<Integer> sayi){
        System.out.println("***");
        sayi.stream().filter(t->t%2==0 ).map(t-> t*t).sorted().forEach(C01_Lambda::yazdir);
    }
    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
    public static void tekKareBuyuktenKucuge(List<Integer> sayi){
        System.out.println("****");
        sayi.stream().
                filter(t->t%2==1 ).
                map(t-> t*t).
                sorted(Comparator.reverseOrder()).
                forEach(C01_Lambda::yazdir);
    }
}
