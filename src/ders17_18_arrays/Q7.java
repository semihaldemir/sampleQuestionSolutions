package ders17_18_arrays;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        //Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.

        int[] arr={1,2,3,4,5,6};

        arrayeElemanEkleme(arr,19);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arrayeElemanEkleme(arr,19)));
    }
    public static int[] arrayeElemanEkleme (int[] arr, int eklenecekSayi){
        int[] arr2=new int[arr.length+1];
        arr2[arr.length]=eklenecekSayi;

        for (int i = 0; i < arr.length; i++) {

            arr2[i]=arr[i];

        }
        return arr2;
    }
}
