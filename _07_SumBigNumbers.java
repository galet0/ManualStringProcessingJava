package _04_ManualStringProcessing;

import java.util.Scanner;

public class _07_SumBigNumbers {
    static Integer carry = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstNumber = scan.nextLine();
        String secondNumber = scan.nextLine();

        System.out.println(addingBigNumbers(firstNumber,secondNumber));

    }

    public static String addingBigNumbers(String add1, String add2){
        StringBuilder sum = new StringBuilder();
        for (int i1 = add1.length() - 1, i2 = add2.length() - 1, carry = 0; i1 >= 0 || i2 >= 0 || carry != 0 ; i1--, i2--) {
            int digit1 = i1 < 0 ? 0 : Integer.parseInt(Character.toString(add1.charAt(i1)));
            int digit2 = i2 < 0 ? 0 : Integer.parseInt(Character.toString(add2.charAt(i2)));

            int digit = digit1 + digit2 + carry;
            if(digit > 9){
                carry = 1;
                digit -= 10;
            } else {
                carry = 0;
            }
            sum.append(digit);
        }
        return sum.reverse().toString();
    }
}
