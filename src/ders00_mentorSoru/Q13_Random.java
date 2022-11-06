package ders00_mentorSoru;

import java.time.DayOfWeek;
import java.time.LocalDate;


import java.util.Random;

public class Q13_Random {
    /*
    Yil degiskeni icin 2013 ila 2099 arasinda random sayi uretin
    ay degiskeni icin 1 ila 12 arasinda random sayi uretin
    gun degiskeni icin 1 ila 28 arasinda random sayi uretin
    LocalDate clasini kullanarak bu uc degiskeni bir method icine gonderin ve random tarih uretin
    degiskenleri class seviyesinde static olarak tanimlayinki asagidaki her method icinde kullanilabilsin (edited)
    urettiginiz tarih haftasonuna veya resmi tatillere denk gelmemeli
     */
    static Random random =new Random();
    static int yil= random.nextInt(87)+2013;
    static int ay= random.nextInt(12)+1;
    static int gun= random.nextInt(28)+1;
    
    

    public static void main(String[] args) {

        System.out.println(tatilHaricRastgeleTarih() + " " + tatilHaricRastgeleTarih().getDayOfWeek());


    }


    private static LocalDate tatilHaricRastgeleTarih(){
        LocalDate rastgeleTarih=LocalDate.of(yil,ay,gun);

        while (rastgeleTarih.getDayOfWeek()== DayOfWeek.SATURDAY ||
                rastgeleTarih.getDayOfWeek()== DayOfWeek.SUNDAY   ||
                (ay==1 && gun==1)   ||
                (ay==4 && gun==23)  ||
                (ay==5 && gun==19)  ||
                (ay==8 && gun==30)  ||
                (ay==10&& gun==29)  ||
                (ay==11&& gun==10)      ){

            tatilHaricRastgeleTarih();
        }


        return rastgeleTarih;
    }


}
