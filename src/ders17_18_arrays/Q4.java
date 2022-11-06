package ders17_18_arrays;

public class Q4 {
    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de istenen bir elemanin
        // var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr={-3,-2,-1,0,1,2,3,4,5,6,7,8,9,6,7,6,5};

        varmiKackere(arr,6);


    }
    public static void varmiKackere (int[] arr,int aranansayi){
            int sayac=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==aranansayi){
                sayac++;
            }

        }
        if (sayac==0){
            System.out.println("aradığınız sayı mevcut değildir");
        }else {
            System.out.println("Aradığınız " + aranansayi + " sayısı " + sayac + " defa tekrarlanmıştır.");
        }
    }
}


