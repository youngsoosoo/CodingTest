import java.util.HashSet;
import java.util.Scanner;

public class remainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<Integer>(); //타입 지정
        HashSet<String> hs1 = new HashSet<String>(); //크기 지정
        int a[] = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
            hs.add(Integer.parseInt(Integer.toString(a[i])) % 42);
            //입력받은 값의 나머지 값을 add를 통해 HashSet에 저장
        }

        sc.close();
        System.out.print(hs.size()); //HashSet의 크기 출력


        System.out.println(hs1.contains("a"));
    }
}
