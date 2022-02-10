package MoshVideos;

public class Casting {

    public static void main(String[] args) {
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        // implicit casting is always automatic when smaller data type is coverted to larger data type
        // i.e byte > short > int > long > float > double
        double a = 10.1;
        double b = a + 20;
        System.out.println(b);
        //explicit casting can only happen within a compartible type
        //as in changing 10.1 (doulble) into int
        double c = 10.1;
        double d = (int)c + 20;
        System.out.println(d);

    }
}
