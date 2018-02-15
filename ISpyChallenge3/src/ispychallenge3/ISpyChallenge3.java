/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispychallenge3;

/**
 *
 * @author Admin
 */
public class ISpyChallenge3 {

    /**
     * @param args the command line arguments
     */
    static int numberOfPossibleCombinations(int input)
    {
        int numberOfCombinations = 0;
        
        if(input>200)
        {
            for(int i=8; i>0; i--)
            {
                numberOfCombinations+=i;
            }

            return numberOfCombinations;
        }
        else
        {
            if(input==200)
            {
                for(int i=8; i>0; i--)
                {
                    numberOfCombinations+=i;
                }
                
                return numberOfCombinations;
            }
            else
            {
                for(int i=7; i>0; i--)
                {
                    numberOfCombinations+=i;
                }

                return numberOfCombinations;
            }
        }
    }
    
    public static void main(String[] args)
    {
        int input =200;
        
        System.out.println("Number of different ways $2 can be made using any number of coins: "+numberOfPossibleCombinations(input));
    }
    
}
