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
public class Nilai extends Penilaian {
    Scanner faya = new Scanner(System.in);
    String predikat;
    int nilai, s,g,m,na;
    
    @Override
    public void data_siswa(){
        System.out.println("Masukkan Nilai : ");
        this.nilai = faya.nextInt();
    }
    
    public void setperingkat(){
        if(this.nilai >=75);
        this.predikat = "--- L U L U S ---";
    } 
        else if (this.nilai =< 75){
        this.predikat = "--- T I D A K  L U L U S ---";
}
}
    public int getNilai(){
        return this.nilai;
}
    public String getPredikat(){
        return this.predikat;
