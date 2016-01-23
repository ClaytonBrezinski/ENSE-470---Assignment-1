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
public class TNode
{
    String word;
    int count;
    TNode left;
    TNode right;
    
    public TNode(String inWord)
    {
        this.word = inWord;
        this.count = 1;
    }
    private void addToCount(TNode node)
    {
        node.count = node.count + 1;
    }
    private void printNodeInfo()
    {
        System.out.println(this.word + " = " + this.count); 
    }
}
