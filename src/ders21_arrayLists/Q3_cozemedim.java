package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q3_cozemedim {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
kismini list olarak bize donduren bir method olusturun
         */

        List<String> liste=new ArrayList<>();
        liste.add("ali");
        liste.add("veli");
        liste.add("deli");
        liste.add("yeli");

        String istenmeyenHarf="e";
        System.out.println(liste);
        System.out.println(liste.size());

        System.out.println(temizlenmisListe(liste,istenmeyenHarf));

    }
    public static List<String> temizlenmisListe (List<String> liste, String harf){
        List<String> newList=new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {

            if (!liste.get(i).contains(harf)){
                newList.add(liste.get(i));
            }

        }return newList;
     }
}

