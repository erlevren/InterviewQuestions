package interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q01 {
    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?
    // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?
    public static void main(String[] args) {
        //1.Task
        Map<String,Integer> ulke = new HashMap<>();
        ulke.put("Turkiye",85000000);
        ulke.put("Amerika",300000000);
        ulke.put("Ingiltere",40000000);
        ulke.put("Almanya",150000000);
        ulke.put("Fransa",30000000);
        //2.Task
        System.out.println(ulke);
        //3.Task
        System.out.println("Ulkeler : "+ulke.keySet());
        //4.Task
        System.out.println("Ulke nufuslari = "+ulke.values());
        //5.Task
        int toplam = 0;
        for (Integer each:ulke.values()) {
            toplam+=each;

        }
        System.out.println("Ulke nufuslari toplami = "+toplam);
        //6.Task
        int sayac = 0;
        for (Integer each:ulke.values()) {
            if(each>50000000){
                sayac++;
            }
        }
        System.out.println("50 milyondan buyuk "+sayac+" adet ulke vardir");
        //7.Task
        for (Map.Entry<String,Integer> each:ulke.entrySet()) {
            System.out.println(each);
        }
        //8.Task
        for (String each:ulke.keySet()) {
            System.out.println(each);
        }
        //9.Task
        for (Integer each:ulke.values()) {
            System.out.println(each);
        }

    }
}
