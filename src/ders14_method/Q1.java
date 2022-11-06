package ders14_method;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
bir method olusturun.
- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
mesaji verin
- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
yazdirin.
         */
        String input = "Java ne kadar güzel";
        int basindex = 5;
        int sonindex = 19;
        System.out.println(input.length());


        aradakileriyazdir(input,basindex,sonindex);


    }

    public static void aradakileriyazdir(String input, int basindex, int sonindex) {
        if (sonindex < basindex) {
            System.out.println("once kucuk sayı girilmelidir");
        } else if (input.length() <= sonindex) {
            System.out.println("girilen sayılar cumlenin karakter sayısından fazla olamaz");
        } else {
            for (int i = basindex; i <sonindex ; i++) {
                System.out.print(input.charAt(i));
            }
            //System.out.println(input.substring(basindex, sonindex + 1));

        }

    }
}












