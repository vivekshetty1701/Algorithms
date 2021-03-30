package shortestpalidrome;

// Leet code 214.
public class Palidrome {
    public String shortestPalindrome(String s) {
        if(s == null){
            return s;
        }
        
        int len = s.length();
        if(len == 0 || len == 1 || isPalidrome(s, 0, len-1)){
            return s;
        }
        
        String result = "";
        for(int i=len-1; i>=0; i--){
            if(isPalidrome(s, 0, i)){
                result = createPalidrome(s, i+1);
                return result;
            }
        }
        
        return result;
    }
    
    private String createPalidrome(String s, int end) {
        if(end == s.length()){
            return s;
        }

        StringBuilder sb = new StringBuilder(s);
        for(int i=end; i<s.length(); i++){
            sb.insert(0, s.charAt(i));
        }

        return sb.toString();

    }

    private boolean isPalidrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++; end--;
        }
        
        return true;
    }
}
