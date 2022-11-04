package four;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[31];
        int[] b = new int[2];
        int c = 0;
        a[0] = 1;
        for(int i=1; i<29; i++){
            c = sc.nextInt();
            a[c] = 1;
        }
        for(int i=0; i<a.length; i++){
            if(a[i] == 0){
                System.out.println(i);
            }
        }
    }
}
