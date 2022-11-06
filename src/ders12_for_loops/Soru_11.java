package ders12_for_loops;

import java.util.Scanner;

public class Soru_11 {
    public static void main(String[] args) {
        /*
        Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
kontrol edin ve sonucu yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("tamsayı giriniz: ");
        int sayi = scan.nextInt();

        int sayac = 0;

        for (int i = 2; i < sayi; i++) {
            if (sayi == 2) {

                break;
            } else if (sayi % i == 0) {
                sayac++;
                break;
            }
        }


            if (sayac == 0) {
                System.out.println("sayı asal sayıdır");
            } else {
                System.out.println("sayı asal sayı değildir");
            }


        }
    }








