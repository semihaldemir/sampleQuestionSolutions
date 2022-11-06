package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
         */

        int[] arr={1,2,3,4,5,6,6,5,4,3,2,1};

        System.out.println(teklestirme(arr));

    }
    public static List<Integer> teklestirme (int[] arr){
        List<Integer> yeniListe = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!yeniListe.contains(arr[i]))
                yeniListe.add(arr[i]);

        } return yeniListe;
    }
}
