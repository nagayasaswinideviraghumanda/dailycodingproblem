import java.util.Scanner;

public class RomantoInteger {
    public  static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(new RomantoInteger().romanToInt(s));
    }
    public int romanToInt(String s) throws IndexOutOfBoundsException {
        int number=0;
        int l=s.length();
        for(int i=0;i<l;i++) {
            if(s.charAt(i)=='I')
                if(i+1<l && s.charAt(i+1)=='V') {
                    number += 4;
                    i+=1;
                }
                else if(i+1 <l && s.charAt(i+1)=='X') {
                    number += 9;
                    i+=1;
                }
                else
                    number+=1;

            else if(s.charAt(i)=='V')
                number+=5;
            else if(s.charAt(i)=='X')
                if(i+1 <l && s.charAt(i+1)=='L') {
                    number += 40;
                    i+=1;
                }
                else if(i+1<l && s.charAt(i+1)=='C') {
                    number += 90;
                    i+=1;
                }
                else
                    number+=10;
            else if(s.charAt(i)=='L')
                number+=50;
            else if(s.charAt(i)=='C')
                if(i+1<l && s.charAt(i+1)=='D') {
                    number += 400;
                    i+=1;

                }
                else if(i+1<l && s.charAt(i+1)=='M') {
                    number += 900;
                    i+=1;
                }
                else
                    number+=100;
            else if(s.charAt(i)=='D')
                number+=500;
            else if(s.charAt(i)=='M')
                number+=1000;
        }
        return number;
    }
}
