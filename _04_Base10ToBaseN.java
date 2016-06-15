package _04_ManualStringProcessing;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by User on 05.06.2016.
 */
public class _04_Base10ToBaseN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        long number = scan.nextInt();
        long divident = 0;
        double rest = 0;
        StringBuilder ouputNumber = new StringBuilder();
        while (true){
            divident = number / base;
            rest = number % base;
            ouputNumber.append((int)rest);
            if(divident < base){
                ouputNumber.append(divident);
                break;
            }
            number = divident;
        }
        System.out.println(ouputNumber.reverse());
    }

}
