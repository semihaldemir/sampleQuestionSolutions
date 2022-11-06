package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
liste olarak dondurecek bir method olusturun.
         */


        System.out.println(isimListesi());







    }
    public static List<String> isimListesi (){
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen listeye eklemek için isim girin, bitirmek için Q'ya basın");
        List<String> isimListesi = new ArrayList<>();
        String isim="";


        do {
            isim= scan.nextLine();
            isimListesi.add(isim);
            isimListesi.remove("q");
            isimListesi.remove("Q");

        }while (!(isim.equalsIgnoreCase("q")));

        return isimListesi;
    }
}
