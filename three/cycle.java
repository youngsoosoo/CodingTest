package three;

import java.util.Scanner;

public class cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = a;
        int count = 0;
        do{ //10의자리 + 1의 자리
            int b = (a/10) + (a%10);
            a = (a%10)*10 + (b%10);
            count++;
        }
        while(result != a);
        System.out.println(count);
    }
}
