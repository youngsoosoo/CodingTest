import java.util.Scanner;

public class xunder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c[] = new int[a];

        for (int i = 0; i < a; i++) {
            c[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) {
            if(c[i] < b){
                System.out.print(c[i] + " ");
            }
        }
    }
}
