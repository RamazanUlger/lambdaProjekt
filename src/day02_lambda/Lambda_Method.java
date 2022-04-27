package day02_lambda;

import day01_lambda.C01_Lambda;
import day01_lambda.C02_FilterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda_Method {
    public static void main(String[] args) {
        // Task : Functional Programming ile listin cift elemanlarinin
        // karelerini ayni satirda aralarina bosluk bırakarak print ediniz
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 17,
                -5,  9, 7, 5));
        ciftlerinKareleri(sayi);
        System.out.println("*");
        tekKupBirfazla(sayi);
        System.out.println("**");
        ciftKare(sayi);
        System.out.println("***");
        maksElamanBul(sayi);
        System.out.println("****");
        ciftKareEleman(sayi);
        System.out.println("*****");
        toplamBul(sayi);
        System.out.println("******");
        ciftCarp(sayi);
    }

    public static void ciftlerinKareleri(List<Integer> sayi) {

        sayi.stream().filter(t -> t % 2 == 0)
                .map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }
    // Task : Functional Programming ile listin tek elemanlarinin
    // kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi

    public static void tekKupBirfazla(List<Integer> sayi) {
        sayi.stream().
                filter(t -> t % 2 == 1).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));
    }

    // Task : Functional Programming ile listin cift elemanlarinin
    // karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    // Task : Functional Programming ile listin cift elemanlarinin
    // karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void ciftKare(List<Integer> sayi) {
        System.out.print("Sayilar : ");
        sayi.stream().filter(t -> t % 2 == 0).map(Math::sqrt).forEach(t -> System.out.print(t + " "));
    }

    public static void maksElamanBul(List<Integer> sayi) {
        Optional<Integer> sayi1 = sayi.stream().reduce(Math::max);
        System.out.println("Max sayi : " + sayi1);
    }
    /*
 reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
 kullanımı yaygındır pratiktir.
 Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
 bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
 reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
 reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
 İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

 */

// Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz}

    public static void ciftKareEleman(List<Integer> sayi) {
        System.out.println(sayi.
                stream().
                filter(C01_Lambda::ciftbul).
                map(t -> t * t).
                reduce(Math::max));
    }
    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
//Lambda Expression...

    public static void toplamBul(List<Integer>sayi) {
        System.out.println(sayi.stream().reduce(0, (a, b) -> a + b));
/*
a ilk degerini her zaman atanan degerden (identity) alır
b degerini her zamana  stream()'dan akısdan alır
a ilk degerinden sonraki her değeri action(işlem)'dan alır

       */
 Optional<Integer> say1=sayi.stream().reduce(Integer::sum);
        System.out.println("ELde edilen toplam"+say1);
    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftCarp(List<Integer> sayi){
        System.out.println("Expression elde edilen "+sayi.stream().filter(C01_Lambda::ciftbul).reduce(1, (a, b) -> a * b));
        System.out.println("Expression olamdan elde dilen"+sayi.stream().filter(C01_Lambda::ciftbul).reduce(Math::multiplyExact));
    }

}