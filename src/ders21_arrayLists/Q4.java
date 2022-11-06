package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane Fibonacci
        sayisini bir list olarak donduren bir method olusturun.
*/



        Scanner scan=new Scanner(System.in);
        System.out.println("fibonacci sayılarının kaç adet olacağını giriniz");
        int girilensayi= scan.nextInt();
        
        if (girilensayi<0){
            System.out.println("0'dan küçük sayı giremezsiniz");
        } else if (girilensayi>=0 && girilensayi<=1) {
            System.out.println("girdiğiniz sayı 1'den büyük olmalı");
            
        }else System.out.println(fibonacciMetodu(girilensayi));


    }
    public static List<Integer> fibonacciMetodu (int girilensayi){
        List<Integer> fibonacciListesi = new ArrayList<>();

        fibonacciListesi.add(0);
        fibonacciListesi.add(1);
        fibonacciListesi.add(1);

        for (int i = 1; i <girilensayi-2 ; i++) {

            fibonacciListesi.add(fibonacciListesi.get(i)+fibonacciListesi.get(i+1));

        }return fibonacciListesi;

        }

    }

