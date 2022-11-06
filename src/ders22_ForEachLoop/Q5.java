package ders22_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
ayri bir liste olarak veren bir program yazin.
         */

        int[] arr1={1,2,3,4,5,6};
        int[] arr2={9,8,7,6,5,4};

        List<Integer> list1=new ArrayList<>();

        for (int each:arr1
             ) {
            for (int each2:arr2
                 ) {
                if (each==each2){
                    list1.add(each);
                }
            }
        }
        System.out.println(list1);
    }
}
