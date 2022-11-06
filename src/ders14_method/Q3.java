package ders14_method;

public class Q3 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
        Girilen sayinin asal sayi olup olmadigini kontrol edip,
        sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
         */

        int input=18;

        System.out.println(asalsayimetodu(input));

    }
    public static String asalsayimetodu (int input){
        String sonuc="";
        for (int i = 2; i <input ; i++) {
            if (input%i==0){
                sonuc="asal sayı değil";
                break;
            }
        }
        if (!(sonuc.equals("asal sayı değil"))){
            sonuc="asal";
        }

        return sonuc;
    }
}
