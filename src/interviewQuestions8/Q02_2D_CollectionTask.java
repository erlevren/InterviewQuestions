package interviewQuestions8;

import java.util.ArrayList;

public class Q02_2D_CollectionTask {
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList

    // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    // Bu 3 ArrayList'i 2D ArrayList'te saklayın
    public static void main(String[] args) {
        ArrayList<ArrayList<String>>list = new ArrayList<>(); // 2D arrayList
        ArrayList<String> calisanlar = new ArrayList<>();
        calisanlar.add("Erol");
        calisanlar.add("Ahmet");
        calisanlar.add("Emrah");
        calisanlar.add("Elif");
        calisanlar.add("TechPro");
        System.out.println("calisanlar = " + calisanlar);//calisanlar = [Erol, Ahmet, Emrah, Elif, TechPro]
        ArrayList<String> isverenler = new ArrayList<>();
        isverenler.add("Haluk");
        isverenler.add("Eylul");
        isverenler.add("Yusuf");
        isverenler.add("Can");
        isverenler.add("Ibrahim");
        isverenler.add("Mehmet");
        System.out.println("isverenler = " + isverenler);//isverenler = [Haluk, Eylul, Yusuf, Can, Ibrahim, Mehmet]
        ArrayList<String>sirketler = new ArrayList<>();
        sirketler.add("Amazon");
        sirketler.add("Google");
        sirketler.add("Testinium");
        sirketler.add("IBM");
        System.out.println("sirketler = " + sirketler);//sirketler = [Amazon, Google, Testinium, IBM]
        list.add(calisanlar);
        list.add(isverenler);
        list.add(sirketler);
        System.out.println(list);//[[Erol, Ahmet, Emrah, Elif, TechPro], [Haluk, Eylul, Yusuf, Can, Ibrahim, Mehmet], [Amazon, Google, Testinium, IBM]]





    }
}
