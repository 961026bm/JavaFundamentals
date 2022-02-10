package MoshVideos;

public class ArithExp {

    public static void main(String[] args) {
        // Expression is a piece of code that produces value
       double result = (double) 10 / 3;
        System.out.println(result);

        int x = 1;
        int y = x++;// x++ increment the value of X but Y stays as 1
       // ++x;
        System.out.println(x);
        System.out.println(y);
        // below is an example of augmented / compound assignment operator
        int a = 2;
          a = a + 2; // is the same a += 2;
        System.out.println(a);

    }
}
