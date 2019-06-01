import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class QueuePalindrome {

    public static void main(String[] args) {
        System.out.println("Enter your string:");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        Queue queue = new LinkedList();

        for (int i =inputString.length()-1; i>=0; i--){
            queue.add(inputString.charAt(i));
        }

        String reverseString = "";
        while (!queue.isEmpty()){
            reverseString = reverseString+queue.remove();
                    }
        if (inputString.equals(reverseString))
            System.out.println("Your string is a palindrome \n");
        else
            System.out.println("Your string is not a palindrome \n");


    }
}
