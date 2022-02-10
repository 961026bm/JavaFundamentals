package MoshVideos;

public class OrderOfOperation {
    // Bodmas
    public static void main(String[] args) {
        int x = 10 + 3 * 2; // 3 * 2 get done 1st
        // except you know the order of operation && put 10 + 3 in ()
        int y = (20 + 3) * 2;
        System.out.println(x);
        System.out.println(y);
    }
}
