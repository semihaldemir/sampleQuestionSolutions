package ders9_10_11_stringManipulations;

import java.util.Scanner;

public class QB2_Lastindexof {
    public static void main(String[] args) {
        /*
        Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini
yazdirin
- String aranan metni icermiyor
- Aranan metin String’de sadece 1 kere kullanilmis
- Aranan metin String’de sadece 1’den fazla kullanilmis
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Please insert a sentence: ");
        String statement= scan.nextLine();
        System.out.print("Please insert the word you looking for: ");
        String text= scan.nextLine();

        if (statement.lastIndexOf(text)==-1){
            System.out.println("sentence doesn't contain the text");
        } else if (statement.lastIndexOf(text)>=0) {
            int firstuse=statement.lastIndexOf(text);
            int seconduse=statement.lastIndexOf(firstuse-1);
            if (firstuse==seconduse){
                System.out.println("sentence contains the text only one");
            } else {
                System.out.println("sentence contains the text more than one");
            }

        }

    }
}
