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
    
    public void BinaryTree()
    {
        this.root = null;
    }
        
    public void addNode(String inWord)
    {
        TNode newNode = new TNode(inWord);
        if(root == null)
        {
            root = newNode;
        }
        // check if the word is currently in the tree already
        boolean addANode = checkForDuplicateWord(inWord);
        if (addANode == true)
        {
            // check for duplicates will automatically increment the count variable.
            return;
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
    public boolean checkForDuplicateWord(String inWord)
    {
        TNode focusNode = root;
        while (focusNode.word.compareToIgnoreCase(inWord) != 0)
        {
            if (inWord.compareToIgnoreCase(focusNode.word) < 0) // if true focus to the left side of the tree's children
            {
                focusNode = focusNode.left;
            }
            else
            {
                focusNode = focusNode.right;
            }
            
            if (focusNode == null)
            {
                return false;
            }
        }
        focusNode.addToCount();
        return true; 
    }
    public void inOrderTraversal(TNode focusNode)
    {
        if (focusNode != null)
        {
            //Go to left node
            inOrderTraversal(focusNode.left);
            // print node's info
            focusNode.printNodeInfo();
            //Go to the right node
            inOrderTraversal(focusNode.right);
        }
    }
}
