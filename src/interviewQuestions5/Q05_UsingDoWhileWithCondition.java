package interviewQuestions5;

import java.util.Scanner;

public class Q05_UsingDoWhileWithCondition {
    /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi=0;
        do {
            System.out.print("Bir sayi giriniz :"); //120 girerse bu satir ve asagidaki satir calisir..
            sayi = scan.nextInt();
            if(sayi<100){  //ancak 120 icin burasi calismaz
                System.out.println("Won!");
            }
        }while(sayi < 100); //sayi 100 den kucuk oldugu surece bu kod blogu calisir..

        System.out.println("Lost!"); //120 icin bu kod satiri calisir
    }
}
