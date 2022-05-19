import java.util.Scanner;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int n = 0;
        for(int i=0;i<columnTitle.length();i++)
            n+=(((int)columnTitle.charAt(i)-65+1)*(Math.pow(26,(columnTitle.length()-i-1))));
        return n;

    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(new ExcelSheetColumnNumber().titleToNumber(s));

    }
}
