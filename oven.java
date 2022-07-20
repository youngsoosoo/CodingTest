import java.util.Scanner;

public class oven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = a * 60 + b + c;
        a = d / 60;
        b = d % 60;

        if(a >= 24){
            a = a - 24;
        }

        System.out.println(a + " " + b);
    }
}
