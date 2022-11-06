package ders20_multiDimentionalArrays;

public class Q5 {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
toplaminini yazdiran bir method olusturun.
         */

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(innerArrSonElementleriTopla(arr));

    }
    public static int innerArrSonElementleriTopla (int[][] arr){
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {

                toplam += arr[i][arr[i].length-1];

        }return toplam;
    }
}
