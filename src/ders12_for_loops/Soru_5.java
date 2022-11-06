package ders12_for_loops;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {

        /*Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
hesaplayin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen 20'den küçük bir sayı giriniz: ");
        int sayi= scan.nextInt();
        int faktoriyelp=1;
        int faktoriyeln=-1;

        if (sayi>=20){
            System.out.println("20'den küçük sayı girin");

        } else if (sayi>0) {
            for (int i = sayi; i >=1 ; i--) {
                faktoriyelp=faktoriyelp*i;
            }
            System.out.println(faktoriyelp);

        } else if (sayi<0) {
            for (int i = sayi; i < -1; i++) {
                faktoriyeln=faktoriyeln*i;
            }
            System.out.println(faktoriyeln);
        }

    }

    }
