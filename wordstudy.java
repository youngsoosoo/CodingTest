import java.util.Scanner;

public class wordstudy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[26];              //A~Z까지 담을 숫자 배열(아스키코드)
        String b = sc.next().toUpperCase(); //입력 값을 담을 문자열
        sc.close();

        int max = 0;    //카운팅 된 수
        int c = 0;      //아스키코드

        for(int i = 0; i < b.length(); i++){
            a[b.charAt(i)-'A']++;   //b에 알파벳이 많은 수가 카운팅
        }


        for(int i = 0; i < a.length; i++){
            if(max < a[i]) {
                max = a[i];
                c = i;
            }else if(max == a[i]){
                c = -2;
            }
        }
        System.out.printf("%s", Character.toString(c+'A'));
    }
}
