/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raport2;

import java.util.Scanner;

/**
 *
 * @author FAYA
 */
public class Mapel extends Penilaian {
    Scanner faya = new Scanner (System.in);
    int a;
    String pelajaran;
    
    @Override
    public void data_siswa(){
        System.out.println("Masukkan Mata Pelajaran : ");
        this.pelajaran = faya.nextLine();
    }
    
    public String getMapel(){
        return this.pelajaran;
    }

    void data_siswa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
