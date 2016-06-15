package _04_ManualStringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 05.06.2016.
 */
public class _02_StringLength {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringBuilder outputLine = new StringBuilder();
        if(input.length() < 20){
            outputLine.append(input);
            for (int i = outputLine.length(); i < 20 ; i++) {
                outputLine.append("*");
            }
        } else if(input.length() >= 20){
            outputLine.append(input);
            outputLine.setLength(20);
        }
        System.out.println(outputLine);

    }
}
