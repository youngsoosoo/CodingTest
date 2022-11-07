package seven;

import java.util.Scanner;

public class constnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b/100;              //백의 자리
        int d = b/10 - (b/100)*10;  //십의 자리
        int e = b%100%10;              //일의 자리
        int f = e*100 + d*10 + c;
        c = a/100;
        d = a/10 - (a/100)*10;
        e = a%100%10;
        int g = e*100 + d*10 + c;
        if(f > g){
            System.out.println(f);
        } else {
            System.out.println(g);
        }
    }
}
