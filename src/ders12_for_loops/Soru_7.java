package ders12_for_loops;

import java.util.Scanner;

public class Soru_7 {
    public static void main(String[] args) {

        /*
        Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("bir tamsayı girin: ");
        int sayi= scan.nextInt();

        String sayiStr=""+ sayi;
        int birlerbas=0;
        int rakamlartop=0;

        for (int i = 1; i <=sayiStr.length() ; i++) {
            birlerbas=sayi%10;
            rakamlartop=rakamlartop+birlerbas;
            sayi=sayi/10;
        }
        System.out.println(rakamlartop);



    }
}
