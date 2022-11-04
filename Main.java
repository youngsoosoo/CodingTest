import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] a = new String[sc.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next();
        }
        sc.close();

        for(int i=0; i<a.length; i++){
            int count = 0;
            int sum =0;
            for(int j=0; j<a[i].length(); j++){
                if(a[i].charAt(j)== 'O')
                    count++;
                else
                    count = 0;

                sum += count;
            }
            System.out.println(sum);
        }
    }
}