import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt() * sc.nextInt() * sc.nextInt();
        int b[] = new int[10];
        int count = 0;

        while (a>0){
            b[a%10]++;
            a /= 10;
        }
        for(int i=0; i<10; i++){

        }
    }
}
