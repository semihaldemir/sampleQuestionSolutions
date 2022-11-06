package ders16_doWhileLoop;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
kontrol edin ve sifredeki hatalari yazdirin.
Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
- Sifre kucuk harf icermelidir
- Sifre buyuk harf icermelidir
- Sifre ozel karakter icermelidir
- Sifre en az 8 karakter olmalidir.
         */

        Scanner scan=new Scanner(System.in);



        int bayrak;
        String sifre;

        do {
            System.out.println("Lutfen şifrenizi giriniz");
            sifre= scan.nextLine();
            bayrak=0;

            //kucukharfkontrolu(sifre);
            int sonuc = kucukharfkontrolu(sifre);
            bayrak=bayrak+sonuc;

            //buyukHarfKontrolu(sifre);
            sonuc = buyukHarfKontrolu(sifre);
            bayrak= bayrak+sonuc;

            //ozelKarakterKontrolu(sifre);
            sonuc = ozelKarakterKontrolu(sifre);
            bayrak= bayrak+sonuc;

            //sifreuzunlugukontrolu(sifre);
            sonuc = sifreuzunlugukontrolu(sifre);
            bayrak=bayrak+sonuc;


        }while(bayrak!=4);

        System.out.println("sifreniz başarıyla kaydedildi");


    }
    public static int kucukharfkontrolu (String sifre){
        int sayac=0;

        for (int i = 0; i < sifre.length(); i++) {

            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                sayac++;
                break;
            }

        }
        if (sayac==0){
            System.out.println("sifre küçük harf içermelidir");
            return 0;
        } else return 1;

    }

    public static int buyukHarfKontrolu (String sifre){
        int sayac=0;
        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                sayac++;
                break;
            }
        }
        if (sayac==0){
            System.out.println("sifre büyük harf içermelidir");
            return 0;
        }else return 1;
    }

    public static int ozelKarakterKontrolu (String sifre){
        int sayac=0;
        String OzelKarakterler="£^#+$%½&{[(])}=/*?_|-<>:.;,``";
        for (int i = 0; i < sifre.length(); i++) {

            if (OzelKarakterler.contains(sifre.substring(i,i+1))) {
                sayac++;
                break;
            }
        }
        if (sayac==0){
                System.out.println("sifre özel karakter içermelidir");
                return 0;
            } else return 1;
        }

        public static int sifreuzunlugukontrolu (String sifre){
        int sayac=0;
        if (sifre.length()>=8){
            sayac++;
        }
        if (sayac==0) {
            System.out.println("sifre en az 8 karakter olmalıdır");
            return 0;
        } else return 1;


    }


}


