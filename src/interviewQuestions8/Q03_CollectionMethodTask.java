package interviewQuestions8;

import java.util.*;

public class Q03_CollectionMethodTask {
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
        //Part 1:
        ArrayList<Integer> sayilar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Sayi giriniz = ");
            sayilar.add(scan.nextInt());
        }
        Collections.sort(sayilar,Collections.reverseOrder());//reverseOrder() ters siralar

        System.out.println("Ters siraladiktan sonra arrList : "+sayilar);//[82, 65, 55, 45, 10]

        Collections.shuffle(sayilar);
        System.out.println("Shuflle yaptiktan sonra : "+sayilar);//[45, 10, 55, 65, 82]

        Collections.rotate(sayilar,3);//Belirtilen listedeki ogeleri kaydirir
        System.out.println("Rotate edildikten sonra : "+sayilar);//[55, 65, 82, 45, 10]

        Integer max = Collections.max(sayilar);
        Integer min = Collections.min(sayilar);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        Collections.replaceAll(sayilar,max,min);//max sayiyi min yapar


        System.out.println("ReplaceAll'dan sonra = "+sayilar);//[55, 65, 10, 45, 10]



    }

}

