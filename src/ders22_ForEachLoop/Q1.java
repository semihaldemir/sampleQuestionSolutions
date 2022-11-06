package ders22_ForEachLoop;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.
         */

        int[] arr={1,2,3,4,5,6,6,5,4,3,2,1};
        List<Integer> tekrarsiz=new ArrayList<>();

        for (int each:arr
             ) {
            if (!tekrarsiz.contains(arr[each])){
                tekrarsiz.add(each);
            }
        }
        System.out.println(tekrarsiz);

        arr=new int[tekrarsiz.size()];

        for (int i = 0; i < tekrarsiz.size(); i++) {
            arr[i]= tekrarsiz.get(i);

        }
        System.out.println(Arrays.toString(arr));

        }

    }

