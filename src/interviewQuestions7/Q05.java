package interviewQuestions7;

import java.util.Arrays;

public class Q05 {
    // Print 2D String array using loops
    public static void main(String[] args) {
        String [][] arr = {{"abc","def","ghi"}, {"jkl","mno","prs"}};
        //1. Yontem
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
        // 2. Yontem
        System.out.println();
        for (String [] each:arr) {
            System.out.print(Arrays.toString(each));
        }
    }
}
