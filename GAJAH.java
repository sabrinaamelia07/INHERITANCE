/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN3;

/**
 *
 * @author PC
 */
public class GAJAH extends Hewan
{
    public static void testClassMethod()
    {
        System.out.println("The class nethod in Hewan...");
    }
    //meng-override method pada class Animal
    public void testInstanceMethod()
    {
        System.out.println("The instance method in Gajah...");
    }
    public static void main (String[] args)
    {
        GAJAH myGAJAH = new GAJAH();
        Hewan myHewan = myGAJAH;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
        
    }
}
