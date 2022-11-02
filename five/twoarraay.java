package five;

import java.util.Scanner;

public class twoarraay {
    /*1. public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] c = new int[N][M];
        int[][] d = new int[N][M];

        for(int i=0; i<N; i++) {
            for (int j = 0; j < M; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<N; i++) {
            for (int j = 0; j < M; j++) {
                d[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print((c[i][j] + d[i][j]) + " ");
            }
            System.out.println();
        }
    }*/
    /*2. public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, max = 0;
        int[][] c = new int[9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                c[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(max <= c[i][j]){
                    max = c[i][j];
                    a=i+1;b=j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(a + " " + b);
    }*/
    /*3.
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] c = new int[100][100];
        int count = 0;

        for(int i=0; i<a; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j=x; j<x+10;j++){
                for(int k=y; k<y+10; k++){
                    c[j][k] = 1;
                }
            }
        }

        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(c[i][j]==1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    */
}
