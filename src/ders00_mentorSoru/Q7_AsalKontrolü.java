package ders00_mentorSoru;

import java.util.Scanner;

public class Q7_AsalKontrolü {
    public static void main(String[] args) {
        /*
        Soru-3  Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
yönlendiriniz. (edited)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Asal sayı olup olmadığını kontrol için bir tamsayı giriniz");
        int sayi= scan.nextInt();
        int bayrak=0;

        if (sayi<=0){

            System.out.println("Pozitif bir tam sayı giriniz");

        } else {

            for (int i = 2; i <sayi ; i++) {
            if (sayi % i == 0) {
                bayrak++;
            }
        }

            if (bayrak>0){
                System.out.println(sayi + " asal değildir");

            }else System.out.println(sayi + " bir asal sayıdır");
        }
    }
}
