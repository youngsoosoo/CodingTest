package seven;

import java.util.Scanner;

public class alphanumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
            int b = sc.nextInt();
            String S = sc.next();
            for(int j=0; j<S.length(); j++){
                for(int k=0; k<b; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
