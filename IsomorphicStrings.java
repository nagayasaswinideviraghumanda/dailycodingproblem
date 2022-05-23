import java.util.*;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s,String t) {
        int m = s.length();
        int n = s.length();
        if(m!=n)
            return false;
        HashMap<Character,Character> k = new HashMap<>();
        for(int i=0;i<m;i++) {
            if(k.containsKey(s.charAt(i))) {
                if(k.get(s.charAt(i))!=t.charAt(i))
                    return false;
                else
                    continue;
            }
            k.put(s.charAt(i),t.charAt(i));
        }
        k.clear();
        for(int i=0;i<m;i++) {
            if(k.containsKey(t.charAt(i))) {
                if(k.get(t.charAt(i))!=s.charAt(i))
                    return false;
                else
                    continue;
            }
            k.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
    public static void main(String...args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        System.out.println(new IsomorphicStrings().isIsomorphic(a,b));
    }
}
