package interviewQuestions8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q01_Calisma {
    //  PART 1
    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
    // ve tüm öğeleri ArrayList'ten Set'e ekleyin

    // PART 2
    // create a method that takes Set<Character> and varargs of char as parameters
    // and adds all chars to the set

    // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
    // ve tüm karakterleri sete ekleyin
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 35, 15, 20, 85));//Array'den List olusturduk
        System.out.println(list);
        Set<Integer> set = new HashSet<>();//Bos bir Set olusturduk
        seteCevir(list,set);//Parametresi List ve Set olan bir method olusturduk
        System.out.println("List'ti Sete attiktan sonra = "+set);
        Set<Character> charSet = new HashSet<>();//Bos bir char Set olusturduk
        charSetekle(charSet,'A','B','D','G','Z','e','t');//charSet ve karakterlerden Varargs bir method olusturduk
        System.out.println(charSet);
    }
    private static void charSetekle(Set<Character> charSet, char ...x) {
        for (char each:x) {//Varargs methodundaki karakterleri Set'e attik
            charSet.add(each);
            //System.out.print(each+" ");
        }
    }
    private static void seteCevir(ArrayList<Integer> list, Set<Integer> set) {
        set.addAll(list);//Olusturdugumuz list'i set'e attik
    }
}
