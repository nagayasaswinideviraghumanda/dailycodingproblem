import java.util.Scanner;

public class ExcelSheetColumnTitle {
    String convertToTitle(int colNum) {
        String t = "";
        while(colNum!=0) {
            t = (char)(colNum%26 + 64) + t;
            colNum=colNum/26;
        }
        return t;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(n));
    }
}
