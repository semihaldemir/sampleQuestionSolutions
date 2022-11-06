package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
tamsayilari bir liste olarak bize donduren bir method olusturun
         */
        int tamsayi = 36;

        System.out.println(tamBolenlerMetodu(tamsayi));

    }

    private static List<Integer> tamBolenlerMetodu(int tamsayi) {
        List<Integer> tamBolenler= new ArrayList<>();

        for (int i = 1; i <= tamsayi; i++) {
            if (tamsayi%i==0){
                tamBolenler.add(i);
            }

        }return  tamBolenler;

    }
}
