package ders12_for_loops;

import java.util.Scanner;

public class Soru_10 {
    public static void main(String[] args) {

        String girilen_yazi="";
        String tersyazi = "" ;

        Scanner yazial=new Scanner(System.in);

        System.out.print("Lütfen kelimenizi giriniz :");

        girilen_yazi=yazial.nextLine();

        for(int i=girilen_yazi.length()-1;i>=0;i--)
            tersyazi+=girilen_yazi.charAt(i);

        System.out.println("\n GİRİLEN : " + girilen_yazi);
        System.out.println("\n TERSİ : " + tersyazi);


    }
}
