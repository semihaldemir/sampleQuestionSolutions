package ders00_mentorSoru;

public class Atm {

    public Atm (){

    }
    int kartNumarasi=0;
    String sifre="girilmedi";
    int menuBakiyeSorgula;
    String menuParaYatirma="2";
    String menuParaCekme="3";
    String menuParaGonderme="4";
    String menuSifreDegistirme="5";
    String menuCikis="0";


    public Atm(int kartNumarasi,String sifre){
        this.kartNumarasi=kartNumarasi;
        this.sifre=sifre;


    }

    @Override
    public String toString() {
        return  "### Menüden Yapacağınız İşlemi Seçiniz ###\n" +
                "\n\t\tBakiye Sorgulamak için   1" +
                "\n\t\tPara Yatirmak için       2" +
                "\n\t\tPara Cekmek için         3" +
                "\n\t\tPara Gondermek için      4" +
                "\n\t\tSifre Degistirmek için   5" +
                "\n\t\tCikis için               0" + "  tuşlarına basınız" ;
    }

    public Atm (int bakiyeSorgula, String paraYatirma,
                String paraCekme, String paraGonderme, String sifreDegistirme, String cikis){
        menuBakiyeSorgula=bakiyeSorgula;
        menuParaYatirma=paraYatirma;
        menuParaCekme=paraCekme;
        menuParaGonderme=paraGonderme;
        menuSifreDegistirme=sifreDegistirme;
        menuCikis=cikis;


    }

}
