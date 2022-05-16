import java.util.Scanner;

public class IntegerToRoman {
    String intToRoman(int num) {
        String t = "";
        while(num!=0) {
            if(num>=1000) {
                t += "M";
                num-=1000;
            }
            else if(num>=900) {
                t+="CM";
                num-=900;
            }
            else if(num>=500) {
                t += "D";
                num-=500;
            }
            else if(num>=400) {
                t+="CD";
                num-=400;
            }
            else if(num>=100) {
                t += "C";
                num -= 100;
            }
            else if(num>=90) {
                t+="XC";
                num-=90;
            }
            else if(num>=50) {
                t += "L";
                num -= 50;
            }
            else if(num>=40) {
                t+="XL";
                num-=40;
            }
            else if(num>=10) {
                t += "X";
                num-=10;
            }
            else if(num>=9) {
                t+="IX";
                num-=9;
            }
            else if(num>=5) {
                t += "V";
                num -= 5;
            }
            else if(num>=4) {
                t+="IV";
                num-=4;
            }
            else {
                t +="I";
                num-=1;
            }
        }
        return t;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(new IntegerToRoman().intToRoman(num));
    }
}
