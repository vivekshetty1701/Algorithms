import arrays.KthLargest;
import shortestpalidrome.Palidrome;

public class App {
    public static void main(String[] args) throws Exception {
        /*String s = "abcd";
        Palidrome p = new Palidrome();
        String result = p.shortestPalindrome(s);
        System.out.println(result);*/

        String s = "abcbabcaba";
        Palidrome p = new Palidrome();
        String result = p.recursiveShortestPalindrome(s);
        System.out.println(result);

        KthLargest test = new KthLargest();
        /*String s = "aaaaaa";
        Palidrome p = new Palidrome();
        String result = p.shortestPalindrome(s);
        System.out.println(result);*/
    }
}
