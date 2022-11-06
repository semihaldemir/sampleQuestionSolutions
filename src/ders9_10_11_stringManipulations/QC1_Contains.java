package ders9_10_11_stringManipulations;

import java.util.Scanner;

public class QC1_Contains {
    public static void main(String[] args) {
        /*
        Soru 1 : Kullanicidan bir cumle alin
- cumlede ev geciyorsa, "home home sweet home" yazdirin
- cumlede is geciyorsa, "calismak guzeldir"
- ikisini de iceriyorsa "Hem ev lazim hem is"
- hicbirini icermiyorsa "cok calisman lazim" yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("Write a sentence: ");
        String sentence= scan.nextLine();

        if (sentence.contains("home") && sentence.contains("work")){
            System.out.println("need both home and work");
        } else if (sentence.contains("work")) {
            System.out.println("working is good");
        } else if (sentence.contains("home")) {
            System.out.println("home sweet home");
        }else {
            System.out.println("You need to work a lot");
        }


    }
}
