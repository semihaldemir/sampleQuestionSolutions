package soruListem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Soru1_KahveMakinasi {

    static Scanner scan = new Scanner(System.in);
    static int tercih;
    static String boy="";
    static String[] hangiKahve;


    public static void main(String[] args) {
        menu();
        System.out.println("\n******************************************");
        System.out.println(tercihYap(tercih) +" " + boy + " Boy Olarak Hazırlandı. Afiyet Olsun!!..");
        System.out.println("******************************************");


    }

    private static void menu() {
        System.out.println("********** KAHVE MAKINASI **********");
        System.out.println("Kahvenizi Seçiniz\n" +
                "\t\t1. Türk Kahvesi\n" +
                "\t\t2. Filtre Kahve\n" +
                "\t\t3. Espresso\n" +
                "\t\t****************");

        tercih = scan.nextInt();
        tercihYap(tercih);
        sutIstermisin();
        sekerIstermisin();
        buyukKucukBoy();



    }

    private static String tercihYap(int tercih) {

        String[] hangiKahve = {"Türk Kahvesi", "Filtre Kahve", "Espresso"};

        switch (tercih) {
            case 1:
                System.out.println(hangiKahve[tercih - 1] + " Hazırlanıyor..");
                break;
            case 2:
                System.out.println(hangiKahve[tercih - 1] + " Hazırlanıyor..");
                break;
            case 3:
                System.out.println(hangiKahve[tercih - 1] + " Hazırlanıyor..");
                break;
            default: {
                System.out.println("hatalı tuşlama yaptınız, belirtilen seçenekleri tuşlayınız");
                menu();
            }
        }return hangiKahve[tercih - 1];
    }

    private static void sutIstermisin() {
        System.out.println("Süt Eklememizi İster misiniz? evet/hayır");
        String evetHayir = scan.next();
        if (evetHayir.equalsIgnoreCase("evet")) {
            System.out.println("Süt Ekleniyor..");
        } else if (evetHayir.equalsIgnoreCase("hayir")) {
            System.out.println("Süt Eklenmiyor");
        } else {
            System.out.println("yanlış seçenek girdiniz");
            sutIstermisin();
        }
    }

    private static void sekerIstermisin() {
        System.out.println("Şeker Eklememizi İster misiniz? evet/hayır");
        String evetHayir = scan.next();
        int kacSeker = 0;
        if (evetHayir.equalsIgnoreCase("evet")) {
            System.out.print("Kaç Şeker Eklemek İstersiniz? :");
            kacSeker = scan.nextInt();
            System.out.println(kacSeker + " Şeker Ekleniyor..");
        } else if (evetHayir.equalsIgnoreCase("hayir")) {
            System.out.println("Şeker Eklenmiyor");
        } else {
            System.out.println("yanlış seçenek girdiniz");
            sutIstermisin();
        }
    }

    private static String buyukKucukBoy() {
        System.out.println("Kahveniz hangi boy olsun? Büyük/Orta/Küçük seçeneklerinden birini giriniz");
        boy = scan.next();
        String[] boylar={"Büyük","Orta","Küçük"};

        for (int i = 0; i < boylar.length; i++) {
            if (boylar[i].equalsIgnoreCase(boy)){
                boy=boylar[i];
                break;
            }
        }

        if (boy.equalsIgnoreCase("büyük")) {
            System.out.println("Kahveniz " + boy +  " Boy Olarak Hazırlanıyor..");
        } else if (boy.equalsIgnoreCase("orta")) {
            System.out.println("Kahveniz " + boy +  " Boy Olarak Hazırlanıyor..");
        } else if (boy.equalsIgnoreCase("küçük")) {
            System.out.println("Kahveniz " + boy +  " Boy Olarak Hazırlanıyor..");
        } else {
            System.out.println("Yanlış giriş yaptınız");
            buyukKucukBoy();
        }
        return boy;
    }
}
