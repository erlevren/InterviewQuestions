package interviewQuestions8;

import java.util.*;

public class Q07_ConvertingCollectionsTask {
    // create an array of random numbers of size 10
    // convert that array into a list
    // convert list into set

    // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer>list = new ArrayList<>();// Rastgele olusturulan array deki sayilati atmak icin bir bos list olusturuldu
        int [] arr =new int [10];//10 elemanli bir array olusturuldu
        for (int each:arr) {
            each+=rnd.nextInt(100);//0-100 arasi rastgele 10 sayi alindi
            System.out.print(each+" ");
            list.add(each);// ve listte atildi
        }
        System.out.println();
        System.out.println("Array'in list hali = "+list);// List yazdirildi
        Set<Integer>set = new HashSet<>(list);//List Set'e cevrildi
        System.out.println("Listin Set hali = "+set);
    }
}
