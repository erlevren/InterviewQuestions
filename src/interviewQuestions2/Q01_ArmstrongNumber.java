package interviewQuestions2;

import java.util.Scanner;

public class Q01_ArmstrongNumber {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        armstrong(sayi);
        girilenSayiyaKadarOlanArmstrong(sayi);
    }


    private static void armstrong(int n) {
        int sayininKupleriToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi =n;

        while (n>0){
            basamaktakiSayi =n%10;
            sayininKupleriToplami +=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            n=n/10;
        }

        if(girilenSayi==sayininKupleriToplami)
            System.out.println(girilenSayi + " sayisi armstrong sayidir");
        else System.out.println(girilenSayi + " sayisi armstrong sayi degildir");

    }

    //soru 2 icin
    private static void girilenSayiyaKadarOlanArmstrong(int sayi) {
        for (int i= 1;i<=sayi;i++){
            armstrong(i); //recursive method uyguladik
        }
    }
}
