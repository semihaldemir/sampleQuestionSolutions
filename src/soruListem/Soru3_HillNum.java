package soruListem;

import java.util.ArrayList;
import java.util.List;

public class Soru3_HillNum {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(1);

        System.out.println(hillNum(list));
    }

    public static int hillNum (List<Integer> list){
        int ortadaki=0;
        for (int i = 1; i < list.size()-1; i++) {
            if (list.get(i)<list.get(i-1) && list.get(i)>list.get(i+1)){
                ortadaki= list.get(i);
            }
        }
        return ortadaki;
    }
}
