package ders15_whileloop;

import java.util.Scanner;

public class Q_500ekadartopla {
    public static void main(String[] args) {
        /*Soru : Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse
toplami yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayac=0;

        while (toplam<500){

            System.out.println("lutfen sayı girin");
            int sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;

        }
        System.out.println("girilen " + sayac + " sayının toplamı " + toplam + " oldu. Limit doldu!!");





    }
}
