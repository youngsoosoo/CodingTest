package four;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        int max = 0;
        int count = 0;
        for(int i=0; i<9; i++){
            a[i] = sc.nextInt();
        }
        max = a[0];
        for(int i=0; i<9; i++){
            if(max < a[i]){
                max = a[i];
                count = i+1;
            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}
