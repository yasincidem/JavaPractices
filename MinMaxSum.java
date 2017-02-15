import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by yasin_000 on 12.2.2017.
 */
public class deneme {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        //First way
        List<Long> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        long MIN = a+b+c+d+e;
        long MAX = a+b+c+d+e;

        Collections.sort(list);
        long minValue = list.get(0);
        long maxValue = list.get(list.size()-1);
        System.out.println((MIN - minValue) + " " + (MAX - maxValue));
        
        //Second way
        
//        List<Long> list = new ArrayList<>();
//        List<Long> listOfSums = Arrays.asList(a,b,c,d,e);
//
//        long sums ;
//        for (int i = 0; i < listOfSums.size(); i++) {
//            sums = 0;
//            for (int j = 0; j < listOfSums.size(); j++) {
//                sums += listOfSums.get(j);
//            }
//            sums -= listOfSums.get(i);
//            list.add(sums);
//        }
//
//        Collections.sort(list);
//        System.out.print(list.get(0) + " " + list.get(list.size()-1));        



    }
}

