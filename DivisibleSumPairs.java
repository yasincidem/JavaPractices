import java.util.*;

/**
 * Created by yasin_000 on 12.2.2017.
 */
public class deneme {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j < i){
                    System.out.println(j + " " + i);
                    int add = (a[i] + a[j]);
                    if ((a[i] + a[j]) % k == 0){
                        list.add(add);
                    }
                }
            }
        }
        System.out.println(list.size());
    }
}

