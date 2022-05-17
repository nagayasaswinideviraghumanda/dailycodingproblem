import java.util.Scanner;

public class RansomNote {
    boolean ransomNote(String rn,String mz) {
        StringBuffer sb = new StringBuffer();
        sb.append(mz);
        for(int i = 0;i<rn.length();i++) {
            int index = sb.indexOf(""+rn.charAt(i));
            if(index==-1)
                return false;
            sb.deleteCharAt(index);
        }
        return true;
    }

    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String rn = sc.next();
        String mz = sc.next();
        System.out.println(new RansomNote().ransomNote(rn,mz));
    }
}
