package interviewQuestions6;

public class Q04_SurviveMonkey {
    	/*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/
        public static void main(String[] args) {
            int numberOfBananas =165;
            int survivalDays = 0;
            boolean monkeyAlive = true;

            do {
                System.out.println("maymunlar gunde 4 muz yer");
                numberOfBananas-=4; //toplam muz sayisindan her seferinde 4 muz eksilir
                survivalDays++;//yasadigi gun sayisini 1 arttir
                if(numberOfBananas<4) {// 4 den az muz kalirsa
                    monkeyAlive =false; //maymun hayatta degil
                    System.out.println("bugun " + survivalDays + " . gun muz kalmadi, Maymun sizlere omur");
                }else System.out.println("bugun " + survivalDays + " . gun, maymun halen yasiyor");

            }while (monkeyAlive);
            System.out.println("Toplam Maymunun yasadigi gun sayisi :" + (survivalDays)); //yasam gunu 0 dan basladigi icin en son 1 ekledik
        }



}

