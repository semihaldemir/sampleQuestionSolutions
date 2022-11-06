package ders15_whileloop;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sayı girin");
        int sayi= scan.nextInt();
        int birlerbasamagi=0;
        int rakamlartoplami=0;


        while (sayi!=0){

            birlerbasamagi=sayi%10;
            rakamlartoplami+=birlerbasamagi;
            sayi/=10;
        }
        System.out.println(rakamlartoplami);
    }
}
