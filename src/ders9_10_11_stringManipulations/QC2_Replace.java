package ders9_10_11_stringManipulations;

public class QC2_Replace {
    public static void main(String[] args) {
        /*
        Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
input1 : “15.30 €” , input2 : “11.40 €”
output : 36.70 €
         */

        String input1="15.30 €";
        String input2="11.40 €";
        String output="36.70 €";

        String total1=input1.replaceAll(" €","");
        String total2=input2.replace(" €","");
        String total3=output.replace(" €","");
        System.out.println(Double.parseDouble(total1)+Double.parseDouble(total2)+Double.parseDouble(total3));




    }
}
