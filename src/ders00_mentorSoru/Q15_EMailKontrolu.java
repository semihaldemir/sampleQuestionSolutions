package ders00_mentorSoru;

import java.util.Scanner;

public class Q15_EMailKontrolu {

    public static void main(String[] args) {
        /*
         * Soru 3) Email kontrolu yapan bir program yazin.
         * Kullanicinin girdigi sifre -
         * -@ isareti icermiyorsa gecersiz email yazdirin -
         * -@gmail.com icermiyorsa
         * "lutfen gmail adresinizi girin" yazdirin -
         * -@gmail.com ile bitmiyorsa
         * "Yazimda bir sorun var, maili kontrol ediniz" yazdirin...
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("E-Mail Giriniz : ");
        String email= scanner.next();
        String bitis= "@gmail.com";
        int sayac=0;

    do {

        if (!email.contains("@")){

            System.out.println("Geçersiz e-mail adresi");
            email=scanner.next();
            sayac++;

        }

        if (!email.contains("@gmail.com")) {

            System.out.println("lutfen gmail adresinizi girin");
            email=scanner.next();
            sayac++;

        }

        if (!(email.substring(email.length()-bitis.length()).equals(bitis))){

            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
            email=scanner.next();
            sayac++;

        }
    }while (!(sayac==0));

        if (sayac==0) System.out.println("mailiniz kabul edildi");


    }
}
