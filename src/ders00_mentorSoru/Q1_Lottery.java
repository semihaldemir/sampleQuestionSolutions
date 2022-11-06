package ders00_mentorSoru;

import java.util.Scanner;

public class Q1_Lottery {
    public static void main(String[] args) {
        /*
         (Oyun: piyango) Madde 3.8 Lottery.java ‘yı yeniden düzenleyerek üç basamaklı
		 * sayılardan bir piyango oluşturun. Program kullanıcıdan üç basamaklı bir sayı
		 * alsın ve aşağıdaki kurallara göre kazancını göstersin:
		 1. Eğer girilen sayı
		 * piyangoda kazanan sayı ile birebir aynısı ise; ödül 10 000 TL
		 2. Eğer girilen
		 * sayının tüm basamakları piyangoda kazanan sayı ile aynı ise; ödül 3 000 TL
		 3.
		 * Eğer girilen sayının bir basamağı piyangoda kazanan sayı ile aynı ise; ödül 1 * 000 TL
         */

        int lottery=456;
        Scanner scan=new Scanner(System.in);
        System.out.println("şansını dene! 100 ile 999 arası bir sayı tut!");
        int guess= scan.nextInt();
        int counter=0;
        int guessbasamak=0;

        if (guess<100 || guess>999){
            System.out.println("Hata! Belirtilen aralıkta bir sayı gir");
        } else if (guess==lottery) {
            System.out.println("****Tebrikler****\n10.000 TL Kazandın");
        } else if (lottery!=guess) {
            Character first=String.valueOf(guess).charAt(0);
            Character second=String.valueOf(guess).charAt(1);
            Character third=String.valueOf(guess).charAt(2);

            if (String.valueOf(lottery).contains(""+first)){
                counter++;
            }
            if (String.valueOf(lottery).contains(""+second)){
                counter++;
            }
            if (String.valueOf(lottery).contains(""+third)){
                counter++;
            }
            if (counter==0){
                System.out.println(":(( üzgünüm tutturamadın :((\n  *** bir daha dene! ***789");
            } else if (counter==1) {
                System.out.println("****İkramiye****\n1000 TL Kazandın");
            } else if (counter==3) {
                System.out.println("****Yaşasın****\n3000 TL Kazandın");
            }
            System.out.println(counter);


        }
            /*
            for (int i = 1; i <=3 ; i++) {
                guessbasamak=guess%10;
                guess=guess/10;
                if (String.valueOf(lottery).contains(String.valueOf(guessbasamak))){
                    counter++;
                }

                }
            }
           // if (String.valueOf(lottery).contains(String.valueOf(guessbasamak))){
             //   counter++;
*/

        }


    }

