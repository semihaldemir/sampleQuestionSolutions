package ders12_for_loops;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
dahil) 7 ila bolunebilen sayilari yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }

        }
    }
}
