package six;

public class self {
    public static int d(int n){
        int a = n;
        while (n != 0){
            a = a + (n%10);
            n /= 10;
        }

        return a;
    }
    public static void main(String[] args) {
        boolean[] b = new boolean[10001];

        for(int i=1; i<10001; i++){
            int a = d(i);
            if(a<10001){
                b[a] = true;
            }
        }

        for(int i=1; i<10001; i++){
            if(!b[i]){
                System.out.println(i);
            }
        }
    }
}
