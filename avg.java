import java.util.Arrays;
import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a[] = new double[sc.nextInt()];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
        }
        sc.close();

        double sum = 0;
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            sum += ((a[i] / a[a.length - 1]) * 100);
        }

    }
}
