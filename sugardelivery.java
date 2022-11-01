import java.util.Scanner;

public class sugardelivery {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N==4 || N==7){               // 4, 7일땐 무조건 -1
            System.out.println(-1);
        }else if (N%5 == 0) {           // 5로 나눈 나머지가 0이라면 N/5
            System.out.println(N/5);
        }else if(N%5 == 1 || N%5 == 3){ // 5로 나눈 나머지가 1과 3이라면 N/5에서 1을 더해준다.
            System.out.println(N/5 + 1);
        }else if(N%5 == 2 || N%5 == 4){ // 5로 나눈 나머지가 2와 4이라면 N/5에서 2를 더해준다.
            System.out.println(N/5 + 2);
        }
    }
}
