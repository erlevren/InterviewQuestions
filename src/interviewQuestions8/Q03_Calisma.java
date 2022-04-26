package interviewQuestions8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Q03_Calisma {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 yer sağa döndür ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Sayi giriniz = ");
            list.add(scan.nextInt());
        }
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Tersden siraladiktan sonra : "+list);
        Collections.shuffle(list);
        System.out.println("Shuffle method'undan sonra : "+list);
        Collections.rotate(list,3);//Belirtilen siradaki sayidan sonra yazdirir
        System.out.println("Rotate edildikten sonra : "+list);

        Integer max = Collections.max(list);
        System.out.println("max = " + max);
        Integer min = Collections.min(list);
        System.out.println("min = " + min);

        Collections.replaceAll(list,max,min);
        System.out.println("Replace'den sonra = "+list);


    }
}
