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
public class PRAKTIKUM2 {
    private String nama;
    private int usia;
    private String mengajar;
    
    //konstruktor
    public PRAKTIKUM2 (String nama, int usia, String mengajar)
    {
    this.nama = nama;
    this.usia = usia;
    this.mengajar = mengajar;
    }
    //Metode
    public void info ()
    {
        System.out.println("Nama : "+this.nama);
        System.out.println("Usia : "+this.usia);
        System.out.println("Mengajar : "+this.mengajar);
    }
}
