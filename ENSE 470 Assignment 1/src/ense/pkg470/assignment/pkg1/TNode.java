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
    public void addToCount()
    {
        this.count += 1;
    }
    public void printNodeInfo()
    {
        System.out.println(this.word + " = " + this.count); 
    }
}
