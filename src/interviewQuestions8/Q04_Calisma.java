package interviewQuestions8;

import java.util.*;

public class Q04_Calisma {
    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak grup uyeleri(List) ile bir map oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul
    public static void main(String[] args) {
        //1. bolum
        Map<String, ArrayList<String>>map=new HashMap<>();// Map isminde bir map olusturduk
        ArrayList<String>galatasaray=new ArrayList<>();//Galatasaray isminde bir list olusturduk
        galatasaray.add("Yusuf");
        galatasaray.add("Kemal");
        galatasaray.add("Mehmet");
        galatasaray.add("Halil");
        System.out.println(galatasaray);
        ArrayList<String>besiktas=new ArrayList<>();//Besiktas isminde bir list olusturduk
        besiktas.add("Erol");
        besiktas.add("Evren");
        besiktas.add("Ali");
        besiktas.add("Veli");
        besiktas.add("Osman");
        System.out.println(besiktas);
        map.put("Cimbom",galatasaray);
        map.put("Kartal",besiktas);
        System.out.println(map);
        Collection<ArrayList<String>> val = map.values();
        for (ArrayList<String> each:val) {
            System.out.println("Map'deki value'larin sayisi = "+each.size());
        }




    }
}
