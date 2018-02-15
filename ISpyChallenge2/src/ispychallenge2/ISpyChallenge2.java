
package ispychallenge2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Admin
 */
public class ISpyChallenge2 
{
    static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    
    static boolean isPalindrome(String string1, String string2)
    {
        return string1.equals(string2);
    }
    
    static String reverseInputString(String input)
    {
        String output = "";
        char[] inputChar = input.toCharArray();
        
        for(int i = inputChar.length-1; i>=0; i--)
        {
            output+=inputChar[i];
        }
        
        return output;
    }
    
    static String cleanString(String input)
    {
        String output = "";
        char[] inputChar = input.toLowerCase().toCharArray();
        
        for(char c:inputChar)
        {
            if(Character.isAlphabetic(c))
            {
                output+=c;
            }
        }
        
        return output;
    }
    
    public static void main(String[] args) throws IOException
    {
        String input;
        String cleanInput, reversedInput;

        System.out.print("Enter a entence to see if it is a palindrome or not: ");
        input = console.readLine();
        
        cleanInput = cleanString(input);
        reversedInput = reverseInputString(cleanInput);
        
        if(isPalindrome(cleanInput, reversedInput))
        {
            System.out.println("The sentence '"+input+"' is a palindrome");
        }
        else
        {
            System.out.println("The sentence '"+input+"' is not a palindrome");
        }
    }
    
}
