package MoshVideos;

import java.util.Arrays;

public class ArrVideo {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        // how to assign values to arrays
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[1]);
        // exceptions are java ways to report problem
        // Arrays.util in java is a way of accessing arrays
        System.out.println(Arrays.toString(numbers));
        // with Java.util.Arrays you can now access the details stored in numbers
        int[] number = {2, 3, 4, 6, 8};
        Arrays.sort(number);
        System.out.println(number.length);

        System.out.println(Arrays.toString(number));
    }
}
