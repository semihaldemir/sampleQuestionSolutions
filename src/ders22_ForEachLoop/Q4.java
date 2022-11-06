package ders22_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
         */
        String sentence="hi everyone how are you!";
        Character letter='j';
        int counter=0;

        List<Character> characters=new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            characters.add(sentence.charAt(i));

        }
        for (Character each:characters
             ) {
            if (each==letter){
                counter++;
            }
        }
        if (counter==0){
            System.out.println("The " + letter + " you look for doesn't contain in the sentence");
        }else {
            System.out.println("The " + letter + " you look for repeats " + counter + " times. ");
        }
    }
}
