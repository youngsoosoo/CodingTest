package seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findalphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int[] b = new int[26];

        for(int i=0; i<b.length; i++){
            b[i] = -1;
        }

        for(int i=0; i<a.length(); i++){
            int c = a.charAt(i) - 97;
            if(b[c] == -1){
                b[c] = i;
            }
        }

        for(int i=0; i<26; i++){
            System.out.print(b[i] + " ");
        }
    }
}
