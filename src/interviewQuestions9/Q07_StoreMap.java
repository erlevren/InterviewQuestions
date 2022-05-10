package interviewQuestions9;

import java.util.HashMap;
import java.util.Scanner;

public class Q07_StoreMap {
    /* 1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
       2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
       3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
       4- Tüm kullanicilarin isimlerini ekrana yazdıralım
    */

    public static void main(String[] args) {
        String secim ="";
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, HashMap<String,String>> kisiListesi = new HashMap<>();
        //       keys    values
        HashMap<String,String>kisiBilgileri = new HashMap<>();
       do {

           System.out.println("adinizi ve soyadinizi giriniz :");
           kisiBilgileri.put("isim", scan.nextLine()); //kullanicidan alinan isim direkt map de isim key inin value suna karsilik gelsin
           System.out.println("adresinizi giriniz :");
           kisiBilgileri.put("adres", scan.nextLine());  //kullanicidan alinan adres direkt map de adres key inin value suna karsilik gelsin
           System.out.println("telefon numarasnizi giriniz :");
           kisiBilgileri.put("telefon", scan.nextLine());  //kullanicidan alinan telefon direkt map de telefon key inin value suna karsilik gelsin
           System.out.println("kimlik no giriniz :");
           //icice yapi var kullanicidan aliğnan bilgiler TC ye gore sekillendigi icin..
           //kisiListesindeki TC datasi; diger kisiBilgilerini bunyesinde barindiriyor..
           kisiListesi.put(scan.nextInt(),kisiBilgileri); //TC yi kisiListesi map ine ekledik
           //TC-> Key;  kisiBilgileri-> Values

           scan.nextLine();//dongunun devam etmesi icin

           System.out.println("kisiBilgileri = " + kisiBilgileri);
           System.out.println("kisiListesi = " + kisiListesi);
           System.out.println("Devam etmek istiyor musnuz : E/H ");
           secim = scan.nextLine();
       } while(secim.equalsIgnoreCase("E"));

        System.out.println("gormek istediginiz kisinin kimlik numarasini giriniz : ");
        System.out.println(kisiListesi.get(scan.nextInt()));
    }

}
