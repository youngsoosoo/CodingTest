import java.util.Scanner;

public class avgover {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();//인원수

        for (int i = 0; i < a; i++) {
            int b[] = new int[sc.nextInt()];
            int sum = 0;//총점
            int avg = 0;//평균
            int stucount = 0; //평균을 넘는 학생 수
            double stupercent = 0;//평균을 넘는 학생 비율

            for (int j = 0; j < b.length; j++) {
                b[j] = sc.nextInt();//입력받은 값 저장
                sum += b[j];// 총점 저장
            }

            avg = sum / b.length;//평균 구하기

            for (int j = 0; j < b.length; j++) {
                if(b[j] > avg){
                    stucount++;//평균보다 높은 학생 수 증가
                }
            }
            stupercent = (double) stucount/b.length * 100;//비율 계산
            System.out.printf("%.3f", stupercent);
            System.out.println("%");
        }
    }
}
