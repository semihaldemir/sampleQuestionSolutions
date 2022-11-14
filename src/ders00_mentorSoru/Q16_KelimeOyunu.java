package ders00_mentorSoru;

import java.util.Scanner;

public class Q16_KelimeOyunu {


    static KelimeOyunu oyuncu1= new KelimeOyunu();
    static KelimeOyunu oyuncu2= new KelimeOyunu();
    static KelimeOyunu[] oyuncular={oyuncu1,oyuncu2};
    static KelimeOyunu kelime=new KelimeOyunu();

    static int kabulRet;
    static String ek="";
    static int oyuncu_1_puan=0;
    static int oyuncu_2_puan=0;


    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {



        System.out.println("\t\t*** KELİME OYUNU ***");

        System.out.print("1. oyuncu adını girin: ");
        oyuncu1.ad = scan.nextLine();
        System.out.print("2. oyuncu adını girin: ");
        oyuncu2.ad = scan.nextLine();
        System.out.println(oyuncu1);



        do {

            System.out.print(oyuncu1.ad + " bir kelime girsin: ");
            kelime.girilenKelime= scan.next();

            System.out.println(oyuncu1.ad +" girdiği kelime: " + KelimeOyunu.girilenKelime);

            System.out.println(oyuncu2.ad +" kelimeyi kabul ediyor mu? " +
                                                "\nevet  için  1'e" +
                                                "\nhayır için  2'ye basın");

            kabulRet = scan.nextInt();
            switch (kabulRet) {
                case 1:
                    for (int i = 0; i < oyuncu1.ad.length(); i++) {
                        oyuncu1.oyuncuPuani++;
                    }
                    System.out.println( oyuncu1.ad +" puanı : " + oyuncu1.oyuncuPuani + " | " +
                            oyuncu2.ad + "  puanı : " + oyuncu_2_puan);

                    System.out.println("devam etmek istiyormusunuz? " +
                                        "\nevet  için  1'e" +
                                        "\nhayır için  2'ye basın");
                    kabulRet = scan.nextInt();
                    switch (kabulRet){
                        case 1:
                            System.out.println("eklemek istediğiniz kelimeyi girin");
                            KelimeOyunu.girilenKelime= scan.next();
                            System.out.println("başa mı ekleyeceksiniz sona mı? " +
                                                "\nbaşa  için  1'e" +
                                                "\nsona  için  2'ye basın");
                            kabulRet= scan.nextInt();

                            switch (kabulRet){
                                case 1:
                                    KelimeOyunu.girilenKelime.concat(ek);
                                    break;
                                case 2:
                                    ek.concat(KelimeOyunu.girilenKelime);
                                    break;
                            }

                            break;
                        case 2:

                            break;
                        default:
                            System.out.println("yanlış tuşlama yaptınız");
                    }


                    break;
                case 2:
                    System.out.println("geçersiz kelime");
                    if (oyuncu_1_puan > oyuncu_2_puan) {
                        System.out.println("kazanan : Oyuncu 1");
                    } else if (oyuncu_1_puan < oyuncu_2_puan) {
                        System.out.println("kazanan : Oyuncu 2");
                    } else if (oyuncu_1_puan == oyuncu_2_puan) {
                        System.out.println("berabere");
                    }

                    break;
                default:
                    System.out.println("1 veya 2'ye basınız");

            }


        }while (kabulRet==1) ;

    }




   /*
    public static String siraDegistirmeMetodu (String[] ikiOyuncu){
        bayrak++;
        return bayrak;
    }


    */

}
