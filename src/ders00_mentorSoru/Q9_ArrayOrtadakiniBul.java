package ders00_mentorSoru;

import java.util.Arrays;

public class Q9_ArrayOrtadakiniBul {
    public static void main(String[] args) {
        /*Soru-5 Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
                Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
              (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10 (edited)
         */

        int[] arr={12,5,8};
        int[] arr2={12,5,8,13};

        System.out.println(ortadakiSayiyiyBul(arr));
        System.out.println(ortadakiSayiyiyBul(arr2));

    }
    public static int ortadakiSayiyiyBul (int[] arr){
        Arrays.sort(arr);
        int ortadakiSayi=0;
        if (arr.length%2==0){
            ortadakiSayi=(arr[(arr.length/2)-1] + arr[arr.length/2])/2;
        }else {
            ortadakiSayi=arr[arr.length/2];
        }return ortadakiSayi;
    }
}
