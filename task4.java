import java.util.Scanner;

public class task4 {
public static void main(String[] args) {
    String word = "";
    System.out.println("Enter a Palindrome word");
    Scanner input = new Scanner(System.in);
    word = input.nextLine();

    StringBuilder word_obj = new StringBuilder(word);
    word_obj.reverse();
    String palindromeWord = word_obj.toString();

    System.out.println(palindromeWord);

    if(palindromeWord.equals(word))
        System.out.println("The input string is Palindrome ");
    
    else
        System.out.println("The input string is NOT Palindrome");
    


}
}