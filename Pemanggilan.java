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
public class Pemanggilan {
    public static void main(String[] args){
        Scanner faya = new Scanner(System.in);
        Penilaian ok = new Penilaian();
        Nilai[] in = new Nilai [20];
        Identitas[] oi = new Identitas[20];
        Mapel[] yo = new Mapel[20];
        
        int Penilaian = 0, p = 0, a;
        ok.Salam();
        while (Penilaian!=3){
            ok.pilih();
            Penilaian = faya.nextInt();
            if(Penilaian==1){
                p++;
                ok.data_siswa();
                in[p]= new Nilai();
                oi[p]= new Identitas();
                yo[p]= new Mapel();
                in[p].data_siswa();
                oi[p].data_siswa();
                yo[p].data_siswa();
                    
            }
            
            if(Penilaian==2){
                a=0;
                ok.tabel();
                while(a<p){
                    a++;
                    System.out.print(a+ "  ");
                    System.out.println(in[a].getClass() + "    ");
                    System.out.println(oi[a].getnama() + "     ");
                    System.out.println(yo[a].getMapel()+ "      ");
                    oi[a].setPredikat();
                    System.out.print(oi[a].getPredikat());
                    System.out.println();
                    
                }
            }
        }
    }
}
