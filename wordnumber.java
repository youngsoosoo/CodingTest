import java.util.Scanner;
import java.util.StringTokenizer;

public class wordnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();

        StringTokenizer str = new StringTokenizer(a, " ");

        System.out.print(str.countTokens());
    }
}
