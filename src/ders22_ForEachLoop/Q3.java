package ders22_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
- Kelimenin uzunlugu cift sayi ise ilk yarisini
- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
yeni bir listeye ekleyip yazdirin
         */

        String[] arr={"Elizabeth", "Linda", "Cameron", "Melani"};

        List<String> evenNumberName=new ArrayList<>();
        List<String> oddNumberName=new ArrayList<>();

        for (String each:arr) {

            if (each.length()%2==0){
                evenNumberName.add(each.substring(each.length()/2));
            }else {
                oddNumberName.add(each.substring(each.length()/2));
            }

        }
        System.out.println(evenNumberName);
        System.out.println(oddNumberName);


    }
}
