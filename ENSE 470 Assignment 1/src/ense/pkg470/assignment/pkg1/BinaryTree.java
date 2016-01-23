/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense.pkg470.assignment.pkg1;

/**
 *
 * @author Dolan
 */
public class BinaryTree 
{
    TNode root;
    
    public void addNode(String inWord)
    {
        TNode newNode = new TNode(inWord);
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            TNode focusNode = root;
            TNode parent;
            
            while (true)
            {
                parent = focusNode; 
                // check where node should go based on the word
                // NEED TO CHECK THIS. IT MAY HAVE TO BE SWITCHED AROUND
                if (inWord.compareToIgnoreCase(focusNode.word) < 0) // put node on the left
                {
                    focusNode = focusNode.left;
                    //if the left node has no children 
                    if (focusNode ==null)
                    {
                        //place the new node on the left
                        parent.left = newNode;
                        return;
                    }
                }
                else // put node on the right 
                {
                    focusNode = focusNode.right;
                    
                    // if the right node has no children
                    if (focusNode == null)
                    {
                       // place the new node on the right
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    public void inOrderTraversal(TNode focusNode)
    {
        if (focusNode != null)
        {
            //Go to left node
            inOrderTraversal(focusNode.left);
            // WW Print
            //Go to the right node
            inOrderTraversal(focusNode.right);
        }
    }
}
