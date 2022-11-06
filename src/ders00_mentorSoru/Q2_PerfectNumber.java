package ders00_mentorSoru;

import java.util.Scanner;

public class Q2_PerfectNumber {
    public static void main(String[] args) {
        /*
        Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
		//Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
		//herhangi bir sayı Mükemmel Sayı olarak bilinir.
		//Input :6
		//Output:6 Mukemmel Sayidir.
		//======================
		//Input7
		//Output:	7 Mukemmel Sayidir degildir.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("sayi girin: ");
        int mSayi= scan.nextInt();
        int bolenTop=0;

        for (int i = 1; i < mSayi; i++) {
            if (mSayi%i==0){
                bolenTop=bolenTop+i;
            }
        }
        if (bolenTop==mSayi){
            System.out.println("girdiğiniz sayı: "+mSayi+" mükemmel sayıdır");
        }else {
            System.out.println("girdiğiniz sayı: "+mSayi+" mükemmel sayıdır değildir");
        }


    }
}
