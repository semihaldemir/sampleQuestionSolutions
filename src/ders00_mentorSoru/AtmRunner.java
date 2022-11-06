package ders00_mentorSoru;

import java.util.Scanner;

public class AtmRunner {
    /*
     * ATM Kullaniciya giris icin kart numarasi ve sifresini isteyin, eger herhangi
     * birini yanlis girerse tekrar isteyin. Kart numarasi aralarda bosluk ile
     * girerse de eger dogruysa kabul edin. Kart numarasi ve sifre dogrulanirsa
     * kullanicinin yapabilecegi islemleri ekrana yazdirin,
     *
     * Bakiye sorgula, para yatirma, para cekme, para gonderme, sifre degistirme ve
     * cikis.
     *
     * Para cekme ve para gonderme isleminde mevcut bakiyeden buyuk para cekilemez,
     * Para gonderme isleminde istenen iban TR ile baslamali ve toplam 26 karakterli
     * olmali, eger degilse menu ekranina geri donsun. Sifre degistirme isleminde
     * mevcut sifreyi teyit ettikten sonra, sifre degisiklik islemini yapmali,
     *
     */
    public static void main(String[] args) {

        Atm semihAldemir=new Atm();

        semihAldemir.kartNumarasi=1;
        semihAldemir.sifre="2";
        semihAldemir.menuBakiyeSorgula=2000;
        int menuIslem;

        int girilenKartNo=0;
        String girilenSifre;
        int flag=0;

        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("Kart numaranızı giriniz");
            girilenKartNo= scan.nextInt();

        }while (!girilenKartKontrol(semihAldemir.kartNumarasi,girilenKartNo));

        do {
            System.out.println("sifrenizi giriniz");
            girilenSifre= scan.nextLine();

        }while (!sifreKontrol(semihAldemir.sifre,girilenSifre));

       do {
           System.out.println(semihAldemir);

        menuIslem = scan.nextInt();

        switch (menuIslem){
            case 1:
                System.out.println("Bakiyeniz : " + semihAldemir.menuBakiyeSorgula + " TL");
                break;
            case 2:
                System.out.print("Hesabınıza yatırmak istediğiniz miktarı giriniz : ");
                int paraYatir= scan.nextInt();
                semihAldemir.menuBakiyeSorgula+=paraYatir;
                System.out.println("Hesabınıza " + paraYatir + " miktarında para yatmıştır. " +
                                    "\nBakiyeniz : " + semihAldemir.menuBakiyeSorgula);
                break;
            case 3:
                System.out.print("Hesabınızdan çekmek istediğiniz miktarı giriniz : ");
                int paraCek= scan.nextInt();
                if (paraCek> semihAldemir.menuBakiyeSorgula){
                    System.out.println("Yetersiz Bakiye");
                }else {
                    semihAldemir.menuBakiyeSorgula -= paraCek;
                    System.out.println("Hesabınızdan " + paraCek + " miktarında para çekilmiştir. " +
                            "\nBakiyeniz : " + semihAldemir.menuBakiyeSorgula);
                }

                break;
            case 4:
                System.out.println("Para Göndereceğiniz Iban Numarasını Giriniz");
                String hesapNo= scan.next();
                if (!hesapNo.substring(0,2).equals("TR")){
                    System.out.println("Iban numarası TR ile başlamalıdır");
                } else if (!(hesapNo.replaceAll("\\D","").length()==24)) {
                    System.out.println("iban uzunluğu 26 karakter olmalıdır");
                }else {
                    System.out.println("göndermek istediğiniz miktarı giriniz");
                    paraCek= scan.nextInt();
                    if (paraCek> semihAldemir.menuBakiyeSorgula){
                        System.out.println("Yetersiz Bakiye");
                    }else  semihAldemir.menuBakiyeSorgula-=paraCek;
                    System.out.println("Hesabınızdan " + paraCek + " miktarında para " +
                                    "\n" + hesapNo + " numaralı hesaba gönderilmiştir " +
                                    "\nBakiyeniz : " + semihAldemir.menuBakiyeSorgula);
                }

                break;
            case 5:
                int sayac=0;
                String sifre;

                do {
                    System.out.println("şifre değiştirmek için mevcut şifrenizi giriniz");
                    sifre= scan.nextLine();

                }while (!sifreKontrol(semihAldemir.sifre,sifre));

                System.out.println("yeni şifrenizi giriniz");
                sifre= scan.nextLine();
                semihAldemir.sifre= sifre;
                System.out.println("şifreniz değişti, yeni şifre : " + semihAldemir.sifre );

                break;

            case 0:
                System.out.println("\t*** Bizi Tercih Ettiğiniz için Teşekkür Ederiz ***");

                break;

            default:
                System.out.println("Geçersiz işlem Girdiniz");
                menuIslem = scan.nextInt();

        }
       }while (menuIslem!=0);




    }


    private static boolean girilenKartKontrol(int kartNumarasi, int girilenKartNo) {
        if (girilenKartNo==kartNumarasi){
            return true;
        }else System.out.println("Yanlış Kart Numarası Girdiniz");return false;
    }
    private static boolean sifreKontrol(String sifre, String girilenSifre) {
        if (sifre.equals(girilenSifre.replaceAll("\\s", ""))){
            return true;
        }else  return false;

    }
}
