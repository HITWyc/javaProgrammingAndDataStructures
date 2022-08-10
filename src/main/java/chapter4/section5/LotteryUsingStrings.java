package chapter4.section5;

import java.util.Scanner;

/**
 * @author wangyc
 * @version 1.11
 * @description 彩票程序产生一个随机数字，提示用户输入一个两位数字，根据规则确定用户是否中彩票
 * @data 2022/8/10 15:36
 */
public class LotteryUsingStrings {
    public static void main(String[] args) {
        // Generate a lottery as a two-digit string
        String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();

        // Get digits from lottery
        char lotteryDigits1 = lottery.charAt(0);
        char lotteryDigits2 = lottery.charAt(1);

        // Get digits from guess
        char guessDigits1 = guess.charAt(0);
        char guessDigits2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess.equals(lottery)){
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigits2 == lotteryDigits1 && guessDigits1 == lotteryDigits2){
            System.out.println("Match all digits: you win $3,000");
        } else if (guessDigits1 == lotteryDigits1 || guessDigits1 == lotteryDigits2
                || guessDigits2 == lotteryDigits1 || guessDigits2 == lotteryDigits2) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
