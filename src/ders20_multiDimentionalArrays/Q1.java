package ders20_multiDimentionalArrays;

public class Q1 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
method olusturun.
         */

        int[][] arr={{1,2,3},{4,5,6,},{7,8,9,},{8,5,2}};

        ciftSayilariTopla(arr);
    }
    public static void ciftSayilariTopla (int[][] arr){
        int ciftsayilartoplami=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0){
                    ciftsayilartoplami+=arr[i][j];
                }
            }
        }
        System.out.println("2 katlı arrayın çift sayılarının toplamı: " + ciftsayilartoplami);
    }

}
