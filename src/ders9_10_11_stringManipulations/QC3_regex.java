package ders9_10_11_stringManipulations;

public class QC3_regex {
    public static void main(String[] args) {
        /*
        Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
input : java1 ogRe2@nMek3 #ne +Gu=zel
output : Java ogrenmek ne guzel.
         */
        String input="java1 ogRe2@nMek3 #ne +Gu=zel";
        String output="";

        input=input.replaceAll("\\d","");
        input=input.replace(" ","5");
        input=input.replaceAll("\\W","");
        input=input.replace("5"," ");

        System.out.println(input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase());

    }
}
