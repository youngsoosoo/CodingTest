import java.util.Scanner;

public class numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() * sc.nextInt() * sc.nextInt();
        sc.close();

        int count = 0;

        String b = Integer.toString(a);

        for(int i=0; i<10; i++){
            for(int j=0; j<b.length(); j++){
                if(b.charAt(j)-'0' == i){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
