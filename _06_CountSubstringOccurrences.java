package _04_ManualStringProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 07.06.2016.
 */
public class _06_CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String word = scan.nextLine();

        Pattern pattern = Pattern.compile(word,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        int start = 0;
        int count = 0;
        while (matcher.find(start)){
            count++;
            start = matcher.start() + 1;
        }


        System.out.println(count);
    }
}
