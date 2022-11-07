package seven;

import java.util.Scanner;

public class croatia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int count = 0;
        for(int i=0; i<S.length(); i++) {
            char C = S.charAt(i);

            if (C == 'c') {
                if(i < S.length()-1){
                    if (S.charAt(i + 1) == '=' || S.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (C == 'd') {
                if(i < S.length()-1){
                    if (S.charAt(i + 1) == 'z') {
                        if(i < S.length()-2){
                            if(S.charAt(i + 2) == '='){
                                i += 2;
                            }
                        }

                    } else if (S.charAt(i + 1) == '-') {
                        i++;
                    }
                }

            } else if (C == 'l' || C == 'n') {
                if(i < S.length()-1){
                    if (S.charAt(i + 1) == 'j') {
                        i++;
                    }
                }

            } else if (C == 's' || C == 'z') {
                if(i < S.length()-1){
                    if (S.charAt(i + 1) == '=') {
                        i++;
                    }
                }

            }
            count++;
        }
        System.out.println(count);
    }
}
