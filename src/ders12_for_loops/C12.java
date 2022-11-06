package ders12_for_loops;

public class C12 {
    public static void main(String[] args) {

        int  sayi=25;
        int sayac=0;

        for(int i=2;i<sayi;i++)
        {
            if(sayi==2) //sayı iki ise asaldir.
            {
                break;
            }
            else if(sayi%i==0) //sayının i'ye bölümünden kalan sıfır ise asal değildir.
            {
                sayac++;
                break;
            }
        }

        if(sayac==0)// eğer dönen sayaç sıfır ise sayı asaldir.
        {
            System.out.println("Girilen sayı asaldır."+sayi);
        }
        else{
            System.out.println("Girilen sayı asal değildir."+sayi);
        }
    }
}
