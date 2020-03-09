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
public class Identitas extends Penilaian {
    Scanner faya = new Scanner(System.in);
    int a;
    String nama;
    
@Override

    public void data_siswa(){
        System.out.println("Masukkan Nama Siswa : ");
        this.nama = faya.nextLine();
    }
    
    public String getnama(){
        return this.nama;
    }

    @Override
    void data_siswa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPredikat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean getPredikat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
