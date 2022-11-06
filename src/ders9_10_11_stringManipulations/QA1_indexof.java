package ders9_10_11_stringManipulations;

import java.util.Scanner;

public class QA1_indexof {
    public static void main(String[] args) {
        /*
        Soru 1 : Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
icerip icermedigini indexOf( ) method’u kullanarak yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Please insert a sentence: ");
        String statement= scan.nextLine();
        System.out.print("Please insert the word you looking for: ");
        String SearchedWord= scan.nextLine();

        if (statement.indexOf(SearchedWord)>=0){
            System.out.println("The sentence contains your word");
        }else if (statement.indexOf(SearchedWord)==-1){
            System.out.println("Not included");
        }else {
            System.out.println("error");
        }








    }
}
