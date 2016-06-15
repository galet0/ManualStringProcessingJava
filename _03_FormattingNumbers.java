package _04_ManualStringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 05.06.2016.
 */
public class _03_FormattingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split("\\s+");
        int a = Integer.parseInt(numbers[0]);
        double b = Double.parseDouble(numbers[1]);
        double c = Double.parseDouble(numbers[2]);

        String aInHex = Integer.toHexString(a).toUpperCase();
        String aInBin = String.format("%10s",Integer.toBinaryString(a)).replace(' ','0');
        if(aInBin.length() > 10){
            aInBin = aInBin.substring(0,10);
        }
        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",aInHex,aInBin,b,c);
    }
}
