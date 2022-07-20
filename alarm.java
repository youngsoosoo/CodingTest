import java.util.Scanner;

public class alarm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        int a = h*60 + m - 45;
        h = a/60;
        m = a%60;

        if(m < 0){
            m = 60 + m;
            h -= 1;
            if(h < 0){
                h += 24;
            }
        }
        System.out.println(h + " " + m);
    }
}