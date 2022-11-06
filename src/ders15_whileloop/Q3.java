package ders15_whileloop;

public class Q3 {
    public static void main(String[] args) {
        /*
        Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
donduren bir method olusturun
         */

        String metin="merhaba televole";
        System.out.println(tersecevir(metin));


    }
    public static String tersecevir (String metin){
        String tersmetin="";
        while (tersmetin.length()!=metin.length()){
            for (int i = metin.length()-1; i >=0 ; i--) {
                tersmetin+=metin.charAt(i);
            }
        }
        return tersmetin;
    }

}
