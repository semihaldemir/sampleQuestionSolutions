package ders14_method;

public class Q4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
bolenleri sayisini bulup bize donduren bir method olusturun.
         */

        int sayi=36;

        System.out.println(pozitiftambolenler(sayi));

    }

        public static String pozitiftambolenler (int sayi){

        String TamBolen="";

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                TamBolen+=i+" ";

            }
        }
        return TamBolen;

    }
}
