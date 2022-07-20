import java.util.Scanner;

public class dice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && a == c){
            int e = 10000 + a * 1000;
            System.out.println(e);
        } else if (a != b && a != c && b != c) {
            int e = Math.max(a, Math.max(b, c)) * 100;
            System.out.println(e);
        }else{
            if(a != b){
                int e = 1000 + c * 100;
                System.out.println(e);
            } else {
                int e = 1000 + a * 100;
                System.out.println(e);
            }
        }
    }
}
