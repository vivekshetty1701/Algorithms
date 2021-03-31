package shortestpalidrome;

// Leet code 214.
public class Palidrome {
    public String shortestPalindrome(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < n; i++) {
            if (s.substring(0, n - i).equals(rev.substring(i)))
                return rev.substring(0, i) + s;
        }
        return "";
    }

    public String recursiveShortestPalindrome(String s)
    {
        int n = s.length();
        int i = 0;
        for (int j = n - 1; j >= 0; j--) {
            if (s.charAt(i) == s.charAt(j))
                i++;
        }
        if (i == n)
            return s;
        String remainRev =new StringBuilder(s.substring(i, n)).reverse().toString();
        return remainRev + recursiveShortestPalindrome(s.substring(0, i)) + s.substring(i);
    }
}
