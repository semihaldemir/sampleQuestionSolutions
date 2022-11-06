package ders00_mentorSoru;

public class Q6_RakamlarToplami {
    public static void main(String[] args) {
        /*
        Soru-2   Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız. (edited)
         */

        int sayi=123456789;
        int toplam=0;


       do {
           toplam+=sayi%10;
           sayi=sayi/10;

       }while (sayi!=0);

        System.out.println(toplam);

    }
}
