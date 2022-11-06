package ders17_18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan array’in boyutunu
        // ve elementlerini alip array’i olusturan
        // ve bize donduren bir method olusturun.


        System.out.println(Arrays.toString(yeniArrayOlustur()));


    }
    public static int[] yeniArrayOlustur (){
        Scanner scan= new Scanner(System.in);
        System.out.println("Arrayin eleman sayısını girin");
        int lenght= scan.nextInt();
        int[] kullaniciArrayi=new int[lenght];

        for (int i = 0; i < kullaniciArrayi.length; i++) {


            System.out.println("eklemek için bir sayı giriniz");
            kullaniciArrayi[i]= scan.nextInt();

        } return kullaniciArrayi;




    }
}
