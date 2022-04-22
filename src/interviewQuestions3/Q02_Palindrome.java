package interviewQuestions3;

import java.util.Scanner;

public class Q02_Palindrome {
      /*
        Crteate a program checks if a String is PALINDROME or not.
        If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
        For Example : "madam" or "nursesrun" .
        Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niçin şart
         */
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.print("String bir ifade giriniz : ");
          String ifade = scan.nextLine();

          palindomeWithStringBuilder(ifade);
          palindromeWithForLoop(ifade);

      }

    private static void palindromeWithForLoop(String str) {
          String tersStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr += str.charAt(i);
        }
        System.out.println("tersStr = " + tersStr);
        if(tersStr.equalsIgnoreCase(str)){
            System.out.print("girilen ifade palindomdur -> " + tersStr);
        }else System.out.print("girilen ifade palindrom degildir ->" +tersStr);
    }

    private static void palindomeWithStringBuilder(String str) {
          StringBuilder sb = new StringBuilder(str);
          String tersStr = sb.reverse().toString();
          if(tersStr.equalsIgnoreCase(str)){
              System.out.println("girilen ifade palindomdur -> " + tersStr);
          }else System.out.println("girilen ifade palindrom degildir ->" +tersStr);
    }

}
