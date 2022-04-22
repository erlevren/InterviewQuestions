package interviewQuestions3;

public class Q01_ReverseString {
        /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */

    public static void main(String[] args) {
        //1.Yol: StringBuilder () kullanarak

        String input = "All is well";

        StringBuilder str = new StringBuilder();
        str.append(input);//bu method String builder a ekleme yapar

        String reverseInput = str.reverse().toString();
        System.out.println("1.yol :" + reverseInput); //1. yol :llew si llA


        //2.Yol: String Classini kullanarak
        System.out.print("2.yol :");//sonraki ifadeyi yanina yazdirabilmek icin

        for (int i = input.length()-1; i >=0 ; i--) { //son karakterden basla, ilk karaktere kadar git..
            System.out.print(input.charAt(i)); //her bir karakteri yazdir
        }

        System.out.println(); //alt satir birlesmesin diye eklenir

        //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
        System.out.print("3.yol :");
        inputTersArray(input);

    }//main sonu
    private static void inputTersArray(String input) {
        char [] arr = input.toCharArray(); //String bir veriyi karakterlere char tipinde ayirir..

        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(arr[i]);

        }

    }//method sonu

}//class sonu
