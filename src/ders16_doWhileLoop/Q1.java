package ders16_doWhileLoop;

public class Q1 {
    public static void main(String[] args) {
        /*
        Soru 1- âkâ harfinden âtâ harfine kadar harfleri yazdirin.
         */

        Character harf='a';


        do {

            System.out.print(harf + " ");
            harf++;

        }while (harf<='z');



    }
}
