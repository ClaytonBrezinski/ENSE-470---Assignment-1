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
                System.out.println("ERROR: File not found.");
                return;
            }
        // deal with the special characters within the string
        line = line.replaceAll("\\/", "");
        line = line.replaceAll("[0-9\\W&&[^'^’]]", " ");
        String[] items = line.trim().split(" +");
        
        BinaryTree tree = new BinaryTree();
        for (int i = 0; i < items.length; i++)
        {
            tree.addNode(items[i]);
        }
        tree.inOrderTraversal(tree.root);
        String a = "a";
    }

}
