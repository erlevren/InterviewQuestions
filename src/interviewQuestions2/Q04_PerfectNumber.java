package interviewQuestions2;

import java.util.Scanner;

public class Q04_PerfectNumber {
    /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz :");
        int sayi = scan.nextInt();

        mukemmelSayi(sayi);
        System.out.println("******************");
        girilenSayiyaKadarOlanMukemmel(sayi);
    }

    private static void mukemmelSayi(int sayi) {
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            //1 den basliyor burada bolenleri kontrol edecegiz, sayi dahil degil dedigi icin <= yapmadik
            if (sayi % i == 0) { //sayinin herhangi bir boleni varsa(i-> bolen)
                toplam += i;
                System.out.print(i + " "); //bolenleri yazdir
            }


        }
        System.out.println();

        if (toplam == sayi) { //bolenlerin toplami sayiya esitese
            System.out.println(sayi + " mukemmel sayidir\n");
        } else System.out.println(sayi + " mukemmel sayi degildir..");

    }

    //soru 2 icin
    private static void girilenSayiyaKadarOlanMukemmel(int girilensayi) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz :");
        girilensayi = scan.nextInt();
        int toplam = 0;
        for (int i = 1; i < girilensayi; i++) { //girilen sayiya kadar olan sayilara bakar
            for (int j = 1; j < i; j++) { //burada bolenler kontrol ediliyor

                if (i % j == 0) {  //sayinin herhangi bir boleni varsa(j-> bolen)

                    toplam = toplam + j; //bolenleri toplama ekliyor
                }

            }
            if (toplam == i) {

                 System.out.println(i + " mukemmel sayidir");
            }
            toplam = 0;

        }
    }
}