package ders15_whileloop;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        Kullaniciya bitirmek
istediginde 0'a basmasini soyleyin
Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
bunlarin toplaminin kac oldugunu yazdirin
Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
negatif sayiyi sayi adedine ve toplama eklemeyin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("toplamak için sayı giriniz. Bitirmek için 0'a basın");
        int girilenSayi=1;
        int toplamSayi=0;
        int sayac=0;

        while (girilenSayi!=0){
            girilenSayi= scan.nextInt();
            if (girilenSayi<0){
                System.out.println("negatif sayı kullanamazsınız");
            }else {
                toplamSayi+=girilenSayi;
                sayac++;
            }

        }
        System.out.println("Girdiğiniz " + sayac + " adet sayının toplamı " + toplamSayi + "'dır.");



    }
}
