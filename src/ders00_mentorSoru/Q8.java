package ders00_mentorSoru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8 {
    /*
    Soru 8 -  * Write a program that deletes the letters 'a' from the names in the list given as input.
	 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
	 *​ OUTPUT : ​ [Veli,Omer]
     */

    public static void main(String[] args) {

        String[] arr = {"Ali", "Veli", "Ayse", "Fatma", "Omer"};
        int count = 0;
        List<String> list = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i].contains("a") || arr[i].contains("A"))) {
                list.add(arr[i]);
            }
        }

        String[] arr2 = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(arr2));

    }
}
