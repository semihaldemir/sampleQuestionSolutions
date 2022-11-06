package ders17_18_arrays;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(array2artir(arr)));


    }
    public static int[] array2artir (int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            arr [i]=arr[i]+2;

        } return arr;


    }

}
