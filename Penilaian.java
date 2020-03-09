/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raport2;

/**
 *
 * @author FAYA
 */
public class Penilaian {
   public void Salam(){
       System.out.println("---------------------------------");
       System.out.println(" P E N I L A I A N   R A P O R T ");
       System.out.println("---------------------------------");
   }
   
   public void pilih(){
       System.out.println("--------------- M E N U --------------");
       System.out.println("1. Isi data raport");
       System.out.println("2. Menampilkan data raport");
       
   }
   
   public void tabel(){
       System.out.println("----- H A S I L  P E N I L A I A N  R A P O R T -----");
       System.out.println("-----------------------------------------------------");
       System.out.println();
       System.out.println("_____________________________________________________");
       System.out.println("NO.    NAMA     MAPEL       NILAI ");
   }

    void data_siswa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
