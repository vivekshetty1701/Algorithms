package shortestpalidrome;

// Leet code 214.
public class Palidrome {
    public String shortestPalindrome(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (s.substring(0, n - i).equals(rev.substring(i)))
                return rev.substring(0, i) + s;
        }
        return "";
    }

    private boolean isPalidrome(String s, int start, int end){
        int mid = start + (start + end)/2;
        return s.substring(start, mid+1).equals(new StringBuilder(s.substring(mid+1, end)).reverse().toString());
    }
}
