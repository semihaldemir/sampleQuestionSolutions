package ders17_18_arrays;

public class Q6 {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.

        String[] arr={"ali","veli","kerim","kahraman"};

        enUzunEnKisaEleman(arr);


    }
    public static void enUzunEnKisaEleman (String[] arr){

        int karaktersayisi=0;
        String enuzun=arr[0];
        String enkisa=arr[0];

        for (int i = 0; i < arr.length; i++) {

        if (arr[i].length()>=enuzun.length()){
            enuzun=arr[i];
        } else if (arr[i].length()<=enkisa.length()) {
            enkisa=arr[i];
        }
        }

        System.out.println("en uzun: " + enuzun);
        System.out.println("en kısa: " + enkisa);
    }
}
