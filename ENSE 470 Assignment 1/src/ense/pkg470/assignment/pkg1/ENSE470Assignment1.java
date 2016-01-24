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
        
        // set this variable to TRUE if you want the program to be able to be invoked from the command line
        boolean userInputted = false;
        String fileToUse = "test/test.txt";
        
        Scanner input;
        Scanner userInput = new Scanner(System.in);
        String line = "";
        if (userInputted == true)
        {
            fileToUse = userInput.next();
        }   
            try
            {
                System.out.println(System.getProperty("user.dir"));
                input = new Scanner(new File(fileToUse));
                
                while (input.hasNextLine())
                {
                    line += input.next()+ " ";
                    // add the "line" to the binary tree
                }
                input.close();
            }
            catch (Exception e)
            {
                // if statement to prevent unusual breaking at the end of the file
                if (line == "")
                {
                System.out.println("ERROR: File not found.");
                return;
                }
            }
        // once the file has been grabbed, begin the timer.
        // Begin Timer
        final long startTime = System.currentTimeMillis();
            
            
        // deal with the special characters within the string
        line = line.replaceAll("\\/", "");
        line = line.replaceAll("[0-9\\W&&[^'^’]]", " ");
        String[] items = line.trim().split(" +");
        
        TreeMap<String, Integer> tree = new TreeMap<String, Integer>();

        String a = "";
        for (int i = 0; i < items.length; i++)
        {
            // if tree is already made and there already contains the same word, increment the counter
            // otherwise add it to the tree
            String check = items[i].toLowerCase();
            if (tree.containsKey(check) == true)
            {
                int increment = tree.get(check).intValue();
                tree.put(check, increment + 1);
            }
            else
            {
                tree.put(items[i].toLowerCase(), 1);
            }
        }
        //tree.inOrderTraversal(tree.root);
        
        Set set = tree.entrySet();
        // Get an iterator
        Iterator i = set.iterator();
        // Display elements
        while(i.hasNext()) 
        {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        
        System.out.println();
        
        // End timer
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "mS");
    }

}
