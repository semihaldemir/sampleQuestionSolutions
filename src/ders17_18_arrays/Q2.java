package ders17_18_arrays;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {

        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.

        int[] arr={-3,-2,-1,0,1,2,3,4,5,6,7,8,9};

        System.out.println(arrayElemanlariniTopla(arr));

    }
    public static int arrayElemanlariniTopla (int[] arr){

        int arrayToplami=0;

        for (int i = 0; i < arr.length; i++) {
           if (arr[i]>0) {
               arrayToplami += arr[i];
           }

        } return arrayToplami;
    }


}
