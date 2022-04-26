package interviewQuestions8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q02_Calisma {
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList
    // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    // Bu 3 ArrayList'i 2D ArrayList'te saklayın
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();//Bos bir 2D List olusturduk
        ArrayList<String> calisanlar = new ArrayList<>();//Bos bir calisanlar list'i olusturduk
        ArrayList<String> isverenler = new ArrayList<>();//Bos bir isverenler list'i olusturduk
        ArrayList<String> sirketler = new ArrayList<>();//Bos bir sirketler list'i olusturduk
        calisanlar.add("Yusuf");
        calisanlar.add("Kemal");
        calisanlar.add("Erol");
        calisanlar.add("Mehmet");
        calisanlar.add("Halil");
        isverenler.add("Haluk");
        isverenler.add("Elif");
        isverenler.add("MehmetH");
        isverenler.add("Ibrahim");
        isverenler.add("Can");
        sirketler.add("TechPro");
        sirketler.add("Amazon");
        sirketler.add("Sony");
        sirketler.add("IBM");
        sirketler.add("Tesla");
        list.add(calisanlar);//Olusturulan list'leri 2D List'e attik
        list.add(isverenler);//Olusturulan list'leri 2D List'e attik
        list.add(sirketler);//Olusturulan list'leri 2D List'e attik
        System.out.println(list);





    }
}
