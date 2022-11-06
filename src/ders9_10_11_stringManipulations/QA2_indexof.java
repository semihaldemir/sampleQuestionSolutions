package ders9_10_11_stringManipulations;

import java.util.Scanner;

public class QA2_indexof {
    public static void main(String[] args) {
        /*
        Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
- String aranan metni icermiyor
- Aranan metin String’de sadece 1 kere kullanilmis
- Aranan metin String’de sadece 1’den fazla kullanilmis
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Please insert a sentence: ");
        String sentence = scan.nextLine();
        System.out.print("Please insert the word you looking for: ");
        String SearchedWord = scan.nextLine();

        if (sentence.indexOf(SearchedWord) == -1) {
            System.out.println("The sentence not contains the searched text");
        } else {
            int firstindex = sentence.indexOf(SearchedWord);
            int lastindex = sentence.indexOf(SearchedWord, firstindex + 1);

            if (lastindex == -1) {
                System.out.println("The text used only one time");
            } else {
                System.out.println("The text used more than one");
            }


        }
    }
}
