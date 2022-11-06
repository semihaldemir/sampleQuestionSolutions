package ders22_ForEachLoop;

public class Q2 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
yazdiran bir method olusturun.
         */
        int[] arr={1,2,3,4,5,6};

        kareleriniAlveTopla(arr);

    }

    private static void kareleriniAlveTopla(int[] arr) {
        int total=0;
        for (int each:arr) {
            total+=each*each;

        }
        System.out.println(total);
    }
}
