package ders15_whileloop;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
olusturun.
         */

        Scanner scan=new Scanner(System.in);
        int sayi=5;
        int us=3;
        ushesaplama(sayi, us);
    }

    public static void ushesaplama (int sayi, int us){
        int sayininussu=1;
        while (us>0){
            sayininussu*=sayi;
            us--;
        }
        System.out.println(sayininussu);



    }

}
