package soruListem;

import ders00_mentorSoru.KelimeOyunu;

import java.util.Scanner;

public class Soru2_KelimeOyunuRunner {

    static Scanner scan=new Scanner(System.in);
    static Soru2_KelimeOyunu oyuncu1=new Soru2_KelimeOyunu();
    static Soru2_KelimeOyunu oyuncu2=new Soru2_KelimeOyunu();



    public static void main(String[] args) {



        System.out.println("**********************\n" +
                           "\tKELİME OYUNU\n" +
                           "*********************");
        System.out.print("Oyuncu 1 İsmi:");
        oyuncu1.isim= scan.nextLine();
        System.out.print("Oyuncu 2 İsmi:");
        oyuncu2.isim= scan.nextLine();

        System.out.println(oyuncu1.isim + " kelime girsin");
        kelimeGir(scan.next());

        ikinciAdim();


    }

    private static String kelimeGir(String kelime) {
        Soru2_KelimeOyunu.kelime=kelime;
        System.out.println("****************\nGirilen Kelime: " + kelime);
        return Soru2_KelimeOyunu.kelime;
    }
    private static void ikinciAdim() {
        System.out.println("Girilen kelimeyi kabul ediyor musunuz? E/H");
        Character evetHayir=scan.next().charAt(0);
        if (evetHayir.equals("e") || evetHayir.equals("E")){
           oyuncu1.puan+=Soru2_KelimeOyunu.kelime.length();
           ucuncuAdim();
        } else if (evetHayir.equals("h") || evetHayir.equals("H")) {
            System.out.println("Girilen kelime geçersiz");
            sonuc();
        }
    }

    private static void sonuc() {
        System.out.println("Puanlar:" +
                "\n" + oyuncu1.isim + " :" + oyuncu1.puan + " puan" +
                "\n" + oyuncu2.isim + " :" + oyuncu2.puan + " puan" +
                "*************\n\tTHE END\n*************");
    }

    private static void ucuncuAdim() {
        System.out.println("Devam etmek istiyor musunuz? E/H");
        Character evetHayir=scan.next().charAt(0);
        if (evetHayir.equals("e") || evetHayir.equals("E")){
            basaSonaEkle();
        }else if (evetHayir.equals("h") || evetHayir.equals("H")) {
            sonuc();
        }
    }

    private static void basaSonaEkle(){
        System.out.println("Başa mı Sona mı eklemek istiyorsunuz? B/S");
        Character basSon= scan.next().charAt(0);
        if (basSon.equals("b") || basSon.equals("B")){
            String ek= scan.next();
            Soru2_KelimeOyunu.kelime=ek.concat(Soru2_KelimeOyunu.kelime);
        } else if (basSon.equals("s") || basSon.equals("S")) {
            String ek= scan.next();
            Soru2_KelimeOyunu.kelime=Soru2_KelimeOyunu.kelime.concat(ek);
        }else {
            System.out.println("yanlış giriş yaptınız başa eklemek için b, sona eklemek için s giriniz");
            basaSonaEkle();
        }
    }


}
