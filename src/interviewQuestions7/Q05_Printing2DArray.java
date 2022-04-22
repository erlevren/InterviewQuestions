package interviewQuestions7;

import java.util.Arrays;

public class Q05_Printing2DArray {

        // Print 2D String array using loops

    public static void main(String[] args) {
        String [][] arr = {{"abc","def","ghi"}, {"jkl","mno","prs"}};

        for (int i = 0; i <arr.length; i++){// outer array
            for (int j = 0;j< arr[i].length; j++){//inner array
                System.out.println(arr[i][j]); //sadece elamanlari yazdirir
            }
        }
        System.out.println(Arrays.deepToString(arr)); //[[abc, def, ghi], [jkl, mno, prs]]
    }
}
