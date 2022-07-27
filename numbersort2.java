import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class numbersort2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> b = new ArrayList<Integer>();
        StringBuilder c = new StringBuilder();
        for(int i=0; i<a; i++){
            b.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(b);
        for(int i : b){
            c.append(i).append("\n");
        }
        System.out.println(c);
    }
}
