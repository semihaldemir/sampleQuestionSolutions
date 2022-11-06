package ders00_mentorSoru;

public class Q5_DoWhile_HarfYazdir {
    public static void main(String[] args) {
        /*
        Soru-1 Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
kod yazınız. (edited)
         */

        Character baslangicHarfi='C';
        Character bitisHarfi='A';

        do {

                System.out.print(baslangicHarfi);
                baslangicHarfi--;


        }while (baslangicHarfi>=bitisHarfi);
    }
}
