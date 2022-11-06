package ders12_for_loops;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi1= scan.nextInt();
        System.out.print("Lütfen 1. sayıdan daha büyük bir sayı giriniz: ");
        int sayi2= scan.nextInt();

        int sayilartoplami=0;

        if (sayi2<=sayi1) {
            System.out.println("lütfen önce küçük bir sayı ve sonra büyük sayı giriniz");
        }else {
            for (int i = sayi1; i <=sayi2 ; i++) {
                sayilartoplami=sayilartoplami+i;
            }

            System.out.println(sayilartoplami);
        }



    }
}
