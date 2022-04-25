package interviewQuestions8;

import java.util.*;

public class Q04_MapTask {
    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> grupUyeleri = new HashMap<>();
        ArrayList<String> devTeam = new ArrayList<>(Arrays.asList("Abdullah","Kutay","Enes Faruk","Yasin"));
        ArrayList<String> qaTeam = new ArrayList<>(Arrays.asList("Kadir","Seher","Gokhan","Bahattin"));
        grupUyeleri.put("Developer Team",devTeam);
        grupUyeleri.put("QA Team",qaTeam);
        System.out.println("Grup isim ve uyeler : "+grupUyeleri);
        //Grup isim ve uyeler : {QA Team=[Kadir, Seher, Gokhan, Bahattin], Developer Team=[Abdullah, Kutay, Enes Faruk, Yasin]}
//2.Bolum 1. yol:
        Collection<ArrayList<String>> values = grupUyeleri.values();
        for (ArrayList<String> kisi:values) {
            System.out.println(kisi.size());//ikisi icinde 4
        }
        //2.Yol:
        Set<String>keys=grupUyeleri.keySet();//keySet() key leri set olarak dondurur
        for (String key:keys) {
            ArrayList<String>grupList=grupUyeleri.get(key);
            System.out.println("Guruptaki uye sayisi : "+key+" "+grupList.size());

        }
        System.out.println("--------------------------------------------------------");
        //3.Yol:
        grupUyeleri.put("Development Team",devTeam);
        grupUyeleri.put("QE Team",qaTeam);
        System.out.println("Development team uye sayisi: "+grupUyeleri.get("Development Team").size());
        System.out.println("QA team uye sayisi: "+grupUyeleri.get("QE Team").size());

    }
}
