package ders00_mentorSoru;

public class Q4_nufus {
    public static void main(String[] args) {
        /*
         Her 7 saniyede bir doğum
         Her 13 saniyede bir ölüm
         Her 45 saniyede yeni bir göçmen gelmektedir
         nüfusun 312,032,486
         Gelecek beş yıl için, her bir yılın nüfus tahminlerini gösterecek bir program yazınız
         */

        int saniye=1;
        int dakika=saniye*60;
        int saat=dakika*60;
        int gun=saat*24;
        int yil=gun*365;
        int tarihYil=2022;
        int nufus=312032486;
        double yillikArtis=yil/7 + yil/45 - yil/13;
        System.out.println(yillikArtis);

        for (int i =1 ; i <6 ; i++) {
            System.out.println(tarihYil + " yılı nufusu " + nufus + "'dır.");
            nufus+=yillikArtis;
            tarihYil++;
        }

    }
}
