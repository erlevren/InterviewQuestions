package interviewQuestions7;

public class Q03_IFElse {
		/*
        Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
        print Rock instead of number and for numbers which are a multiple of 5, print Star instead of the number.
        For numbers which are a multiple by of both 3 and 5, print RockStar instead of the number.
        ORNEK:
            INPUT     : 1 2 3 4 ..... 30
            OUTPUT : 1 2 Rock 4 Star Rock 7 8 Rock Star 11 Rock 13 14 RockStar...
		 */

    public static void main(String[] args) {
        for (int i = 1; i <=30; i++){
            if (i%3==0 && i%5==0){
                System.out.print("RockStar ");
            }else if(i%3==0) {
                System.out.print("Rock ");
            }else if(i%5==0){
                System.out.print("Star ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
