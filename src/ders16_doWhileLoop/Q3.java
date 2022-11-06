package ders16_doWhileLoop;

public class Q3 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
bulunuz, tamkare ise true değilse false yazdırınız.
Ornek : input : 16, output: 4
         */

        int sayi=81;
        int kok=1;
        int bayrak=0;

        do {

            if (kok*kok==sayi){
                System.out.println("true");
                bayrak++;
                break;
            }else {
                kok++;
            }

        }while (kok*kok<=sayi);

        if (bayrak==0){
            System.out.println("false");
        }


    }
}