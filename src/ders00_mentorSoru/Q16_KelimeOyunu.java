package ders00_mentorSoru;

import java.util.Scanner;

public class Q16_KelimeOyunu {


    static String oyuncu_1="";
    static String oyuncu_2="";
    static String kabulRet="";
    static int oyuncu_1_puan=0;
    static int oyuncu_2_puan=0;

    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("oyuncu 1 bir kelime girsin");
        oyuncu_1= scan.next();

        System.out.println("Oyuncu 1'in girdiği kelime: " + oyuncu_1);

        System.out.println("Oyuncu 2 kelimeyi kabul ediyor mu? evet/hayır");
        kabulRet =scan.next();
        switch (kabulRet){
            case "evet":
                for (int i = 0; i < oyuncu_1.length(); i++) {
                    oyuncu_1_puan++;
                }
                System.out.println("oyuncu 1 puanı : " + oyuncu_1_puan+
                                  "\noyuncu 2 puanı : " + oyuncu_2_puan);

                break;
            case "hayır":
                System.out.println("geçersiz kelime");
                if (oyuncu_1_puan>=oyuncu_2_puan){
                    System.out.println("kazanan : Oyuncu 1");
                }else System.out.println("kazanan : Oyuncu 2");

                break;
            default:
                System.out.println("evet veya hayır giriniz");

        }

    }
    public static int siraDegistirmeMetodu (int[] ikiOyuncu){
        int bayrak=0;

        bayrak++;
        return bayrak;
    }


}
