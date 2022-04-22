package interviewQuestions3;

import java.util.Scanner;

public class Q04_FrequencyOfCertainChar {
    /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir isim giriniz : ");
        String isim = scan.nextLine();
        System.out.print("bir karakter giriniz :");
        char karakter = scan.next().charAt(0); //tek karakteri alir

        int sayac = 0;
        for (int i = 0; i < isim.length(); i++) {
            if(isim.charAt(i) == karakter)
                sayac++;
        }
        System.out.print("tekrar sayisi :" +sayac);

    }

}
