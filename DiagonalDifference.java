import java.util.Scanner;

/**
 * Created by yasin_000 on 12.2.2017.
 */
public class deneme {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        int sumSagEgik = 0;
        int sumSolEgik = 0;

        int size = a.length -1;
        for(int i = 0; i<a.length; i++){
            sumSolEgik += a[i][i];
            sumSagEgik+= a[i][size-i];
        }
        System.out.println(Math.abs(sumSagEgik-sumSolEgik));
    }
}

