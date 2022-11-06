package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /*Soru 5- Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
        bir liste olarak bize donduren bir method olusturun.
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("fibonacci sınırını belirleyiniz");
        int fsiniri= scan.nextInt();

        if (fsiniri<0){
            System.out.println("fibonacci sayısı 0'dan küçük olamaz");
        } else if (fsiniri<1) {
            System.out.println("1'den büyük sayı girmelisiniz");

        } else fibonacci(fsiniri);


    }

    private static void fibonacci(int fsiniri) {
        List<Integer> fibonacciSayilari= new ArrayList<>();
        fibonacciSayilari.add(0);
        fibonacciSayilari.add(1);
        fibonacciSayilari.add(1);


        for (int i = 1; i < fsiniri; i++) {
            int sayi=fibonacciSayilari.get(i) + fibonacciSayilari.get(i+1);
            if (sayi<fsiniri){
                fibonacciSayilari.add(sayi);
            } else if (sayi>=fsiniri) {
                break;
            }

        }
        System.out.println(fibonacciSayilari);
    }

}
