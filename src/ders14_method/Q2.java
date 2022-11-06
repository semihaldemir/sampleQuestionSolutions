package ders14_method;

public class Q2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
 Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
 isim bosluk soyisim seklinde bize donduren bir method olusturun
 input : isim : Ali soyisim :YILMAZ.    output : Ali Yilmaz
         */

        String ad="Ali";
        String soyad="YILMAZ";

        adsoyadbirlestir(ad,soyad);
        adsoyadbirlestir("MeHmeT", "DayıOĞlU");

    }

    public static String adsoyadbirlestir (String ad, String soyad){
        String AdSoyad=ad.substring(0,1).toUpperCase() + ad.substring(1).toLowerCase()
                + " " + soyad.substring(0,1).toUpperCase() + soyad.substring(1).toLowerCase();
        System.out.println(AdSoyad);
                return AdSoyad;
    }
}
