package main.java.com.algorithm;

/**
 * Created by alexandr on 30.09.15.
 *
 * {@link http://www.aucev.edu.in/placementcell/Materials/App3.pdf}
 * ****************************************************************
 * 13) In Java, You can create a String object as below:
 *     String str = "abc"; & String str = new String("abc");
 */
public class С {

    public static void main(String[] args) {
        /* {@link http://www.aucev.edu.in/placementcell/Materials/App3.pdf} */
        String x = "abc";
        String y = "abc";

        String x1 = new String("abc");
        String x2 = new String("abc");

        /* {@link http://www.quizful.net/interview/java/adding-items-to-hashmap} */
        System.out.println(hash(10000));
    }

    static int hash(int h) {
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

}
