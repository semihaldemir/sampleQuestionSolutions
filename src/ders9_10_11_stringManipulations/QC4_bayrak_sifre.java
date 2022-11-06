package ders9_10_11_stringManipulations;

import java.util.Scanner;

public class QC4_bayrak_sifre {
    public static void main(String[] args) {
        /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
basariyla kaydedildi" yazdirin
- ilk harf kucuk harf olmali
- son karakter rakam olmali
- sifre bosluk icermemeli
- uzunlugu en az 10 karakter olmali
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Şifrenizi Giriniz: ");
        String sifre = scan.nextLine();
        int bayrak=0;


        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("şifrenin ilk harfi küçük olmalıdır");
            bayrak++;
        }
        if (!(sifre.charAt(sifre.length()-1) >= '0' && sifre.charAt(sifre.length()-1) <= '9')) {
            System.out.println("son karakter rakam olmalı");
            bayrak++;
        }
        if (sifre.contains(" ")){
            System.out.println("şifre boşluk içermemelidir");
            bayrak++;
        }
        if (!(sifre.length()>=10)){
            System.out.println("şifre en az 10 karakter olmalı");
            bayrak++;
        }
        if (bayrak==0){
            System.out.println("şifreniz başarıyla kaydedildi");
        }


    }
}