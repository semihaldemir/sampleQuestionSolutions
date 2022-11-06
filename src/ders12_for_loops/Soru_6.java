package ders12_for_loops;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
         */
        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen 20'den küçük bir sayı giriniz: ");
        int sayi= scan.nextInt();
        int faktoriyelp=1;
        int faktoriyeln=-1;

        if (sayi>=20){
            System.out.println("20'den küçük sayı girin");

        } else if (sayi>0) {
            for (int i = sayi; i >=1 ; i--) {
                faktoriyelp=faktoriyelp*i;
            }
            for (int i = sayi; i >=1 ; i++) {
                System.out.print(sayi+"!; "+ i + " "+ faktoriyelp);
            }



        } else if (sayi<0) {
            for (int i = sayi; i < -1; i++) {
                faktoriyeln=faktoriyeln*i;
            }
            System.out.println(faktoriyeln);
        }

    }
}
