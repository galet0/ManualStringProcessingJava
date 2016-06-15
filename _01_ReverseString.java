package _04_ManualStringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 05.06.2016.
 */
public class _01_ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = reader.readLine();
        StringBuilder output = new StringBuilder();
        for (int i = inputLine.length() - 1; i >= 0 ; i--) {
            output.append(inputLine.charAt(i));
        }
        System.out.println(output);
    }
}
