package ders00_mentorSoru;

import java.util.List;
import java.util.Scanner;

public class Q14_HesapMakinasi {

    static double sayi, sayi2;
    static String islem="";


    public static void main(String[] args) {
        /*
        Problem Tanımı :
  Basit 4 işlem yapan bir hesap makinesi kodlayınız....
  Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
  Kullanicidan iki sayi girmesini isteyiniz.
  Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("sayi : ");
        sayi= scan.nextDouble();

        System.out.print(   "\ntopla: +" +
                            "\nçıkar: -" +
                            "\nçarp : *" +
                            "\nböl  : /" +
                            "\nişlem: ");
        islem= scan.next();
        System.out.print("2. sayı: ");
        sayi2= scan.nextDouble();


        System.out.println("Sonuç : " + islemYapMetodu(sayi, islem, sayi2));


    }

    private static double islemYapMetodu(double sayi, String islem, double sayi2) {
        double sonuc=0;
        switch (islem){
            case "*":
                sonuc=carpMetodu(sayi,sayi2);
                break;
            case "/":
                sonuc=bolMetodu(sayi,sayi2);
                break;
            case "-":
                sonuc=cikarMetodu(sayi,sayi2);
                break;
            case "+":
                sonuc=toplametodu(sayi,sayi2);
                break;
            default:
                System.out.println("dogru islem girin");
        }
        return sonuc;
    }

    private static double bolMetodu(double sayi, double sayi2) {
        double bolum=sayi/sayi2;
        return bolum;
    }

    private static double carpMetodu(double sayi, double sayi2) {
        double carpim=sayi*sayi2;
        return carpim;
    }

    private static double cikarMetodu(double sayi, double sayi2) {
        double cikan=sayi-sayi2;
        return cikan;
    }

    private static double toplametodu(double sayi, double sayi2) {
        double toplam=sayi+sayi2;
        return toplam;
    }
}
