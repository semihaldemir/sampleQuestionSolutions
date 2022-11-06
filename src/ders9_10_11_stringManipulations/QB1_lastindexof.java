package ders9_10_11_stringManipulations;

public class QB1_lastindexof {
    public static void main(String[] args) {
        /*
        Soru 1 : Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
icerip icermedigini lastIndexOf( ) method’u kullanarak yazdirin.
         */

        String sentence="Hello everyone, I'm Semih";
        String text="no";

        if (sentence.lastIndexOf(text)==-1){
            System.out.println("sentence doesn't contains");
        }else System.out.println("sentence contains");





    }
}
