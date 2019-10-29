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
public class Employ extends PRAKTIKUM2 
{
    private String noGuru;
    //konstruktor
    public Employ (String noGuru, String nama, int usia, String mengajar)
    {
    super(nama, usia, mengajar);
    this.noGuru = noGuru;
    }
    //metode
    public void info ()
    {
        System.out.println("NO.Guru : "+this.noGuru);
        super.info();
    }
    //Akhir Employ
}
