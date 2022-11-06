package ders00_mentorSoru;

import java.util.Scanner;

public class Q3_obeb_ekok {
    public static void main(String[] args) {
        /*Kullanıcıdan 2 tamsayı girmesini ve ardından
//GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat)
		// bulmasını isteyin.
//Input :
//30
//40
//Beklenen Cikti:
//Beklenen Cikti:
//30 ve 40 icin GCD = 10
//30 ve 40 icin LCM = 120
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayı girin");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int GCD = 0;
        int LCM = 0;

        if (sayi1 < sayi2) {
            for (int i = sayi1; i >= 1; i--) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    GCD = i;
                    break;
                }
            }
        } else if (sayi2 < sayi1) {
            for (int i = sayi2; i >= 1; i--) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    GCD = i;
                    break;
                }
            }
        }
        sayi1 = sayi1 / GCD;
        sayi2 = sayi2 / GCD;
        System.out.println(sayi1);
        System.out.println(sayi2);

        for (int i = 2; i <= sayi2; i++) {
                if (sayi2 % i == 0 ) {
                    sayi2=sayi2/i;
                    LCM = GCD * i;

                    if (sayi2 == 1) {
                    break;
                }

                }
            }

            for (int i = 2; i <= sayi1; i++) {
                if (sayi1 % i == 0 ) {
                    sayi1=sayi1/i;
                    LCM = GCD * i;

                    if (sayi1 == 1) {
                        break;
                }


                }
            }

            System.out.println("LCM: " + LCM);
            System.out.println("GCD: " + GCD);
        }
    }

