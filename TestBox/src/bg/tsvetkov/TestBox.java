package bg.tsvetkov;

import java.util.*;

public class TestBox {
    public static void main(String[] args) {
        String s = String.format("%,d", 1000000000);
        System.out.println(s);
        System.out.printf("%,8d WOW MAN\n", 100000);
        
        Date today = new Date();
        System.out.printf("%tA, %tB, %td\n", today, today, today);
        System.out.printf("%tA, %<tB, %<td\n", today);
    }
}
