package ders12_for_loops;

import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucuk olsa da program calissin
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi1= scan.nextInt();
        System.out.print("Lütfen bir sayı daha giriniz: ");
        int sayi2= scan.nextInt();

        int sayilartoplami=0;

        if (sayi2==sayi1) {
            System.out.println("lütfen farklı sayılar giriniz");

        }else if (sayi1>sayi2){
            for (int i = sayi2; i <=sayi1 ; i++) {
                sayilartoplami=sayilartoplami+i;
            }

        } else if (sayi2>sayi1) {
            for (int i = sayi1; i <=sayi2 ; i++) {
                sayilartoplami=sayilartoplami+i;
            }
            System.out.println(sayilartoplami);

        }

    }
}
