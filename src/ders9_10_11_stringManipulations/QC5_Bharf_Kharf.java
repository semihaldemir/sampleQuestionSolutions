package ders9_10_11_stringManipulations;

public class QC5_Bharf_Kharf {
    public static void main(String[] args) {
        /*
        Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
yazdirin
- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
harflerle yazdirin.
         */

        String isim="aliosman";
        String soyisim="küpeli";

        if (isim.length()>soyisim.length()){

            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+ " " +
                    soyisim.substring(0,1).toUpperCase()+soyisim.substring(1));

        }else {
            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+ " " +
                    soyisim.substring(0).toUpperCase());

        }

    }
}
