package interviewQuestions9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q08_ReadFileTxt {
       /*
    1)Create a text file inside this package
    2)Type the following text inside the text file
       Java is easy to learn.
       Learn Java, earn money?
       Java is easy if you study well.
       To learn Java, type codes.
    3)Type code to print every word is used how many times in the text.
   */

    public static void main(String[] args) throws IOException {
        Map<String,Integer> wordCounter = new HashMap<>(); //wordCounter mapi olusturduk

        List<String> satirlar = Files.readAllLines(Paths.get("src/interviewQuestions9/Q08_FileText"), StandardCharsets.UTF_8);
        //StandardCharsets : UTF_8 dahil olmak uzere Charset icin sabitleri tanimlar..
        //UTF_8 (Unicode Transformation Format)     8: 8 bitlik bir unicode donusum bicimidir..

        for (String each: satirlar
             ) {
            String kelimeler [] = each.split(" "); //her kelimeyi ayirdik..arr yaptik
            for (String item :kelimeler
                 ) {
                if(item.endsWith(",") || item.endsWith(".") || item.endsWith("?")){ //kelime ayrimlari dusunulerek bu sartlar yazildi
                    item =item.substring(0,item.length()-1);    //kelimenin 0.indexinden son karakterine kadar dahil olarak al
                                                                // noktalama isaretlerini almaz
                }

                if(!wordCounter.containsKey(item)){ //onceden bakilan bir kelime key olarak yoksa
                    wordCounter.put(item,1); // sayisi 1 olsun
                }else{
                    wordCounter.put(item,wordCounter.get(item)+1) ;// onceden bakilan bir kelime ise sayisini 1 arttir
                }
            }
        }

        System.out.println(wordCounter);

        //{Java=4, codes=1, study=1, learn=2, is=2, type=1, easy=2, money=1, earn=1, well=1, Learn=1, to=1, To=1, if=1, you=1}


    }
}
