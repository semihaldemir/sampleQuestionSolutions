package ders15_whileloop;

public class Q1 {
    public static void main(String[] args) {
        /*
        Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
yazdirin.
         */

        int sayi = 10;
        String yediyebolen = "";
/*
        while (sayi >= 10 && sayi < 100) {
            for (int i = 10; i < 100; i++) {
                if (i % 7 == 0) {
                    yediyebolen += i + " ";
                }
                sayi++;
            }
            System.out.print(yediyebolen);
        }
*/
        for (int i = 10; i < 100; i++) {
            if (i % 7 == 0) {
                yediyebolen += i + " ";
            }


        }
        System.out.println(yediyebolen);


    }
}
