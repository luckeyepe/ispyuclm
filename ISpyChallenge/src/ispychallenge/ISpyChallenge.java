/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispychallenge;

/**
 *
 * @author Admin
 */
public class ISpyChallenge {

    /**
     * @param args the command line arguments
     */
    static boolean isAFactorOf3Or5(int i)
    {
        return (i%3 == 0) || (i%5 ==0);
    }
    
    public static void main(String[] args) 
    {
        int sum=0;

        for(int i=1; i<1000; i++)
        {
            if(isAFactorOf3Or5(i))
            {
                sum+=i;
            }
        }
        
        System.out.println("Sum of all multiples o 3 or 5 below 1000 is "+ sum);
    }
    
}
