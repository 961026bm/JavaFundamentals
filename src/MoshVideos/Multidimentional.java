package MoshVideos;

import java.util.Arrays;

public class Multidimentional {

    public static void main(String[] args) {
        //single dimentional array
        int[] number = new int[5];
        // two dimensional arrays
      //  int [][] numbers = new int [2][3];
        //numbers[0][0] = 1;
        int [][] numbers = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(numbers));

    }
}
