package ders15_whileloop;

import java.util.Scanner;

public class Q_sifre {
    public static void main(String[] args) {
        /*
        Soru : Kullanicidan Kullanicidan sifre isteyin asagidaki sartlari saglamayan
sifrelerde hatalari yazdirip, kullanicinin yeni sifre girmesi isteyin
Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin gecerli sifre
yazilinca “sifreniz basari ile kaydedildi” yazdirin
sartlar :
- sifrenin ilk karakteri kucuk harf olmali
- sifrenin son karakteri sayi olmali
         */

        Scanner scan=new Scanner(System.in);
        boolean sifregecerlimi=false;
        String sifre="";
        int sayac=0;

        while (sifregecerlimi!=true) {
            System.out.println("şifrenizi giriniz");
            sifre= scan.nextLine();
            sayac=0;

            if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
                System.out.println("sifrenin ilk karakteri kucuk harf olmali");
                sayac++;
            }
            if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
                System.out.println("sifrenin son karakteri sayi olmali");
                sayac++;
            }
            if (sayac==0){
                sifregecerlimi=true;
                System.out.println("sifreniz başarıyla kaydedildi");
            }
        }




    }
}
