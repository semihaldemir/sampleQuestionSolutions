package ders00_mentorSoru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q8_Fibonacci {
    public static void main(String[] args) {
        /*
        Soru-4 Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz. Ardından bu fibonacci
sayılarını yazdıran kodu yazınız.
Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır. (edited)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Fibonacci sayılarının kaç tane olacağını giriniz");
        int fibonacciSayisi= scan.nextInt();

        List<Integer> fibDizisi= new ArrayList<>();
        fibDizisi.add(0);
        fibDizisi.add(1);
        fibDizisi.add(1);

        if (fibonacciSayisi<3){
            System.out.println("3'ten büyük bir sayı girmelisiniz");
        }else {
            for (int i = 1; i <=fibonacciSayisi-3 ; i++) {

                fibDizisi.add(fibDizisi.get(i)+fibDizisi.get(i+1));

            }
        }

        System.out.println(fibDizisi);


    }
}
