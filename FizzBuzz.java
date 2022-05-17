import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            if(i%3==0&&i%5==0)
                l.add("FizzBuzz");
            else if(i%3==0)
                l.add("Fizz");
            else if(i%5==0)
                l.add("Buzz");
            else
                l.add(Integer.toString(i));
        }
        return l;
    }

    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new FizzBuzz().fizzBuzz(n));
    }
}
