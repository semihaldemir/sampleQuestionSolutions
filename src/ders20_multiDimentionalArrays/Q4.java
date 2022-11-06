package ders20_multiDimentionalArrays;

public class Q4 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
method olusturun.
         */

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(elemanlariCarp(arr));

    }
    public static int elemanlariCarp (int[][] arr){
        int carpimSonucu=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpimSonucu *= arr[i][j];

            }

        }return carpimSonucu;

    }
}
