/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author PC
 */
public class KonstruktorSuperKelas {
    public static void main (String [] args)
    {
        Employ programer = new Employ ("100703","RARA", 22, "PKN");
        programer.info();
        
        Employ programer2 = new Employ ("111006", "SENO", 35,"BHS.INGGRIS");
        programer2.info();
        
        Employ programer3 = new Employ ("170117", "BAGUS", 20, "SISTEM KOMPUTER");
        programer3.info();
    }
}
