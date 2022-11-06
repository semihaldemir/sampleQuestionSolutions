package ders20_multiDimentionalArrays;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
olusturacagimiz tek katli bir array’e bu toplamlari atayin.
input : int[][] arr = {{3,4,5}, {2,3,6,7}};
output: [5, 7, 11]
         */

        int[][] arr = {{3,4,5}, {2,3,6,7}};
        int indexSayisi=0;

        if (arr[0].length>=arr[1].length){
            indexSayisi = arr[1].length;
        } else {
            indexSayisi = arr[0].length;
        }

        int[] yeniArr = new int[indexSayisi];

        for (int i = 0; i < yeniArr.length ; i++) {
            yeniArr[i]=arr[0][i] + arr [1][i];

        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
