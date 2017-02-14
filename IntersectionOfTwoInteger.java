import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by yasin_000 on 12.2.2017.
 */
public class IntersectionOfTwoInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 1; i < a ; i++) {
            if (a%i == 0){
                list1.add(i);
            }
        }
        for (int i = 1; i < a ; i++) {
            if (b%i == 0){
                list2.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        List<Integer> intersect = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println(intersect.size());
    }
}

