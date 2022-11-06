package ders00_mentorSoru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_Market {

    /*
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
     * yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
     * method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
     * gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
     * kazandığını gösteren bir method yazınız.
     */

    // 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
    static String[] gunler={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
    // 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun.
    static List<Integer> gunlukKazanclar=new ArrayList<>();

    public static void main(String[] args) {




        Scanner scan=new Scanner(System.in);
        int sayac=0;

        // 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        while (sayac!=7){
            for (int i = 0; i < gunler.length; i++) {
                System.out.println(gunler[i] + " gününün kazancını giriniz");
                int gununKazanci= scan.nextInt();
                gunlukKazanclar.add(gununKazanci);
                sayac++;
            }
        }
            // 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
            System.out.println("Haftalık ortalama kazancınız : " + getOrtalamaKazanc(gunlukKazanclar) +"TL");

            // 5. Adım :getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile
            // * tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o
            // * günleri return yap.
            System.out.println("Ortalamanın Uzerinde Kazanç Olan Günler : " + getOrtalamaninUstundeKazancGunleri(gunlukKazanclar));

            // 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı
            // method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
            // ortalama kazançtan aşağıysa o günleri return yap.
            System.out.println("Ortalamanın Altında Kazanç Olan Günler : " + getOrtalamaninAltindaKazancGunleri(gunlukKazanclar));


    }

    private static List getOrtalamaninAltindaKazancGunleri(List<Integer> gunlukKazanclar) {
        List<String> ortAltiKazancGunleri=new ArrayList<>();
        for (int i = 0; i <gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i)<getOrtalamaKazanc(gunlukKazanclar)){
                ortAltiKazancGunleri.add(gunler[i]);
            }
        }return ortAltiKazancGunleri;
    }

    private static List getOrtalamaninUstundeKazancGunleri(List<Integer> gunlukKazanclar ) {
        List<String> ortUstuKazancGunleri=new ArrayList<>();
        for (int i = 0; i <gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i)>getOrtalamaKazanc(gunlukKazanclar)){
                ortUstuKazancGunleri.add(gunler[i]);
            }

        }return ortUstuKazancGunleri;
    }

    private static int getOrtalamaKazanc(List<Integer> gunlukKazanclar) {
        int toplamKazanc=0, ortalamaKazanc=0;
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            toplamKazanc+=gunlukKazanclar.get(i);
        }
        ortalamaKazanc=toplamKazanc/gunlukKazanclar.size();
        return ortalamaKazanc;
        }

    }

