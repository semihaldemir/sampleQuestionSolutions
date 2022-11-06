package ders00_mentorSoru;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_Manav {
    public static void main(String[] args) {
        /*
 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
 *
 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
 * 2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster
 * istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
 */

        List<String> manav=new ArrayList<>();
        manav.add("Elma");
        manav.add("Armut");
        manav.add("Üzüm");
        manav.add("Erik");
        manav.add("Mısır");

        int secilenurun=0;
        double toplamUcret=0;
        char baskaUrun='e';
        List<Integer> fiyatlar=new ArrayList<>();
        fiyatlar.add(10);
        fiyatlar.add(12);
        fiyatlar.add(15);
        fiyatlar.add(20);
        fiyatlar.add(18);


        do {
            Scanner scan=new Scanner(System.in);
            System.out.println("Ürün seçiniz:" +
                    "\nElma  (10TL) için  1" +
                    "\nArmut (12TL) için  2" +
                    "\nÜzüm  (15TL) için  3" +
                    "\nErik  (20TL) için  4" +
                    "\nMısır (18TL) için  5'e basınız.");

            secilenurun= scan.nextInt();
            if (!(secilenurun>0 && secilenurun<6)) {

                System.out.println("Lütfen ürün seçmek için belirtilen sayıları giriniz");

            }else {

                System.out.println( manav.get(secilenurun-1) + " ürününden kaç kilo almak istiyorsunuz?");
                double kilo= scan.nextInt();
                if (kilo<=0){
                    System.out.println("Kilo miktarı 0'dan büyük olmalıdır");
                    kilo= scan.nextInt();
                }else {

                    toplamUcret+=kilo* fiyatlar.get(secilenurun-1);
                }

                System.out.println("Başka bir ürün almak istiyor musunuz?" +
                        "\nevet  için  e" +
                        "\nhayır için  herhangi bir tuşa basın");

                baskaUrun=scan.next().charAt(0);

            }



        }while (baskaUrun=='e' || baskaUrun=='E');

        System.out.println("toplam borcunuz : " + toplamUcret + " TL");


            }


        }



