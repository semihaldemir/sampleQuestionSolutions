package ders12_for_loops;

import java.util.Scanner;

public class Soru_9 {
    public static void main(String[] args) {
        /*
        Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("bir cümle yazınız: ");
        String str= scan.nextLine();

        int karakter=str.length();

        for (int i = 1; i <=karakter ; i++) {
            System.out.print(str.charAt(karakter-i));

        }

    }
}
