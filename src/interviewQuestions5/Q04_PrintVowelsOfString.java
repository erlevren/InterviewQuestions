package interviewQuestions5;

import java.util.Scanner;

public class Q04_PrintVowelsOfString {
    //Get String from user and print just vowels(aeiou) inside String on the console

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scanner.nextLine().toLowerCase();//soruda kucuk harf istemis o yuzden toLowerCase yaptik
        System.out.println("1.yol ile while loop");
        //1.yol:
        int index = 0; //while loop start condition
        while (index < str.length()) {
            char c = str.charAt(index);
            //str nin her bir indexindeki karakteri char olarak c variable ina ata
            if (c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){ //c variable i bunlardan birine esitse
                System.out.print(c); // c yi yazdir
            }
            index++; //indexi artirarak dongude devam ettir
        }
        System.out.println();
        System.out.println("2.yol ile replace All methodu");
        //2.yol
        String s = str.replaceAll("[^aeiou]", "");
        //[]: icerisindeki butun karakterlere islem yapar
        // ^ : yanindaki karakterlerin disindakileri alir
        System.out.println(s);
    }
}
