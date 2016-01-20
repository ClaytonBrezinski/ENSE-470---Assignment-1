/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense.pkg470.assignment.pkg1;
import java.util.*;
import java.io.File;
/**
 *
 * @author Dolan
 */
public class ENSE470Assignment1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // read in test.txt and places the words in a ___
        Scanner input;
	try
	{
            input = new Scanner(new File("test.txt"));
            
            while (input.hasNextLine())
            {
                String line = input.nextLine();
                // add the "line" to the binary tree
            }
            input.close();
    	}
    	catch (Exception e)
	{
            System.out.println("ERROR: File not found.");
            return;
    	}
    }
    
}
