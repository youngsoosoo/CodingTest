package six;

import java.util.Scanner;

public class arithmetic {
    public static int d(int n){
        int count = 0;

        if(n < 100){
            return n;
        }else{
            count = 99;

            int a = 0;
            int b = 0;
            int c = 0;

            for(int i=100; i<=n; i++){
                a = i/100;  //백의 자리
                b = i/10 - a*10;      //십의 자리
                c = i - a*100 - b*10;      //일의 자리
                if(((a-b) == (b-c)) || ((b-a) == (c-b))){
                    count++;
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = d(N);
        System.out.println(count);
    }
}
