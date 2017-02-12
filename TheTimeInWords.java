import java.util.Scanner;

public class TheTimeInWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h= scan.nextInt();
        int m = scan.nextInt();
        String hours[] = {"one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "ten", "eleven", "twelve"};
        String minutes [] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
                "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
                "twenty six", "twenty seven", "twenty eight", "twenty nine"};
        String hh = "";
        String xh = "";
        for (int i = 1,j = 0; i < hours.length ; i++,j++) {
            if (h == i){
                hh = hours[j];
                xh = hours[j+1];
            }
        }
        if (m == 0){
            System.out.println( hh + " o' clock");
        }else if (m == 1){
            System.out.println("one minute past " + hh);
        } else if (m == 15){
            System.out.println("quarter past " + hh);
        } else if (m == 30){
            System.out.println("half past " + hh);
        }else if (m == 45){
            System.out.println("quarter to " + xh);
        }else if(m == 59){
            System.out.println("one minute to " + xh);
        } else if(m < 30 ){
            String  x = minutes[m-1];
            System.out.println(x + " minutes past " + hh);
        }else if(m > 30 ){
            int y = 59 - m;
            String t = minutes[y];
            System.out.println(t + " minutes to " + xh);
        }
    }
}