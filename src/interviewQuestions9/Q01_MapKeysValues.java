package interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q01_MapKeysValues {
    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?
    // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?

    public static void main(String[] args) {
        HashMap<String,Integer> ulke = new HashMap<>();
        ulke.put("Almanya", 80);
        ulke.put("Turkiye", 83);
        ulke.put("Amerika", 250);
        ulke.put("Fransa", 68);
        ulke.put("Kanada ", 40);

        System.out.println("ulke isimleri ve nufuslari :" + ulke + " milyondur");
        System.out.println("--------------------------------------------");

        System.out.println("ulke isimleri : " + ulke.keySet());
        //ulke isimleri : [Turkiye, Fransa, Almanya, Amerika, Kanada ]
        System.out.println("--------------------------------------------");

        System.out.println("ulke nufuslari :" + ulke.values());
        //ulke nufuslari :[83, 68, 80, 250, 40]
        System.out.println("--------------------------------------------");

        int sayac = 0; //sayac-> nufusu 50 milyondan fazla olan ulke sayisi
        for (Integer buyukMu :ulke.values()){ //ulke nufuslarina bak
            if(buyukMu>50){ //50 milyondan buyukse
                sayac++; //1 arttir
            }
        }

        System.out.println("nufusu 50 milyondan fazla olan ulke sayisi :" +sayac);

        System.out.println("--------------------------------------------");
        int nufus = 0;
        for (Integer toplam:ulke.values()
             ) {
            nufus +=toplam;

        }
        System.out.println("nufus toplami : " + nufus);
        System.out.println("--------------------------------------------");

        for (Map.Entry<String, Integer>siralama:ulke.entrySet()) { // entrySet = key + value
            System.out.println(siralama);
        }
        System.out.println("--------------------------------------------");

        for (String ulkeSirasi:ulke.keySet() //sadece key
             ) {
            System.out.println(ulkeSirasi);
        }


        for (Integer nufusSirasi:ulke.values() //nufuslari
        ) {
            System.out.println(nufusSirasi);
        }
    }
}
